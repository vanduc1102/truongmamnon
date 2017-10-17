package TDSchool.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.dao.RoleDAO;
import TDSchool.com.model.Role;
import TDSchool.com.model.LoginAccount;

import TDSchool.com.model.Role;

@Controller
public class RoleController {
	
	@Autowired(required=true)
	@Qualifier(value="RoleDao")
	private RoleDAO RoleDao;



	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;

	@RequestMapping(value="/admin/Role")
	public ModelAndView listRole(){
		List<Role> listRoles = RoleDao.listRole();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Role/listRole");
		model.addObject("LRole",listRoles);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Role/New", method = RequestMethod.GET)
	public ModelAndView newRole(){
		ModelAndView model = new ModelAndView("admin/Role/newRole");
		model.addObject("NRole", new Role());

		return model;
	}
	
	@RequestMapping(value="/admin/Role/Add", method=RequestMethod.POST)
	public String addRole(@ModelAttribute Role prod){
		if(prod.getRoleId() == 0){
			this.RoleDao.addRole(prod);
		}
		return "redirect:/admin/Role";
	}
	
	@RequestMapping(value="/admin/Role/Remove/{id}")
	public String removeRoles(@PathVariable("id") int id){
		this.RoleDao.removeRole(id);
		return "redirect:/admin/Role";
	}
	
	@RequestMapping(value="/admin/Role/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editRole(@PathVariable("id") int id){
		Role listRoleById = RoleDao.findRole(id);
		ModelAndView model = new ModelAndView("admin/Role/editRole");
		model.addObject("FRole",listRoleById);

		return model;
	}
	
	@RequestMapping(value="/admin/Role/Update", method=RequestMethod.POST)
	public String updateRole(@ModelAttribute Role pro){
		if(pro.getRoleId() != 0){
			this.RoleDao.updateRole(pro);
		}
		return "redirect:/admin/Role";
	}
	
	@RequestMapping(value="/admin/Role/Search")
	public ModelAndView searchRole(String searchString){
		List<Role> listRoles = RoleDao.searchForRole(searchString);
		ModelAndView model = new ModelAndView("admin/Role/listRole");
		model.addObject("LRole",listRoles);
		return model;
	}
}

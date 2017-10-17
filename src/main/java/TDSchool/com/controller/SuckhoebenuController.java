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


import TDSchool.com.dao.SuckhoebenuDAO;
import TDSchool.com.dao.ChuansuckhoeDAO;
import TDSchool.com.dao.HocsinhDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.Chuansuckhoe;
import TDSchool.com.model.Suckhoebenu;
import TDSchool.com.model.LoginAccount;
import TDSchool.com.model.Suckhoebenu;

@Controller
public class SuckhoebenuController {
	
	@Autowired(required=true)
	@Qualifier(value="SuckhoebenuDao")
	private SuckhoebenuDAO SuckhoebenuDao;
	@Autowired(required=true)
	@Qualifier(value="HocsinhDao")
	private HocsinhDAO HocsinhDao;
	@Autowired(required=true)
	@Qualifier(value="ChuansuckhoeDao")
	private ChuansuckhoeDAO ChuansuckhoeDao;
	
	

	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;
	
	@RequestMapping(value="/admin/Suckhoebenu")
	public ModelAndView listSuckhoebenu(){
		List<Suckhoebenu> listSuckhoebenus = SuckhoebenuDao.listSuckhoebenu();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Suckhoebenu/listSuckhoebenu");
		model.addObject("LSuckhoebenu",listSuckhoebenus);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Suckhoebenu/New", method = RequestMethod.GET)
	public ModelAndView newSuckhoebenu(){
		ModelAndView model = new ModelAndView("admin/Suckhoebenu/newSuckhoebenu");
		model.addObject("NSuckhoebenu", new Suckhoebenu());
		model.addObject("ListHoc", HocsinhDao.listHocsinh());
		model.addObject("ListChuan", ChuansuckhoeDao.listChuansuckhoe());
		List<Chuansuckhoe> listChuansuckhoes = ChuansuckhoeDao.listChuansuckhoe();
		model.addObject("LChuansuckhoe",listChuansuckhoes);

		return model;
	}
	
	@RequestMapping(value="/admin/Suckhoebenu/Add", method=RequestMethod.POST)
	public String addSuckhoebenu(@ModelAttribute Suckhoebenu prod){
		if(prod.getSuckhoebenuid() == 0){
			this.SuckhoebenuDao.addSuckhoebenu(prod);
		}
		return "redirect:/admin/Suckhoebenu";
	}
	
	@RequestMapping(value="/admin/Suckhoebenu/Remove/{id}")
	public String removeSuckhoebenus(@PathVariable("id") int id){
		this.SuckhoebenuDao.removeSuckhoebenu(id);
		return "redirect:/admin/Suckhoebenu";
	}
	
	@RequestMapping(value="/admin/Suckhoebenu/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editSuckhoebenu(@PathVariable("id") int id){
		Suckhoebenu listSuckhoebenuById = SuckhoebenuDao.findSuckhoebenu(id);
		ModelAndView model = new ModelAndView("admin/Suckhoebenu/editSuckhoebenu");
		model.addObject("FSuckhoebenu",listSuckhoebenuById);
		model.addObject("ListHoc", HocsinhDao.listHocsinh());
		model.addObject("ListChuan", ChuansuckhoeDao.listChuansuckhoe());
		return model;
	}
	
	@RequestMapping(value="/admin/Suckhoebenu/Update", method=RequestMethod.POST)
	public String updateSuckhoebenu(@ModelAttribute Suckhoebenu pro){
		if(pro.getSuckhoebenuid() != 0){
			this.SuckhoebenuDao.updateSuckhoebenu(pro);
		}
		return "redirect:/admin/Suckhoebenu";
	}
	
	@RequestMapping(value="/admin/Suckhoebenu/Search")
	public ModelAndView searchSuckhoebenu(String searchString){
		List<Suckhoebenu> listSuckhoebenus = SuckhoebenuDao.searchForSuckhoebenu(searchString);
		ModelAndView model = new ModelAndView("admin/Suckhoebenu/listSuckhoebenu");
		model.addObject("LSuckhoebenu",listSuckhoebenus);
		return model;
	}
}

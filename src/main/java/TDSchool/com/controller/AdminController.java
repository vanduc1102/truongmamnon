package TDSchool.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import TDSchool.com.dao.HocsinhDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.LoginAccount;

@Controller
public class AdminController {
	
	@Autowired(required=true)
	@Qualifier(value="HocsinhDao")
	private HocsinhDAO HocsinhDao;
	
	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;
	
	
	@RequestMapping(value="/admin/teacher/{username}")
	public String teacherPage(){
		return "adminTeacher";
	}
	
	@RequestMapping(value="/admin/parent/{username}")
	public String parentPage(@PathVariable("username") String username, ModelMap model){
		LoginAccount account  = this.accountlogDao.findAccountByName(username);
		int hocsinhId = account.getHs().getHocsinhid();
		model.addAttribute("HocsinhByAccount", this.HocsinhDao.findHocsinh(hocsinhId));
		model.addAttribute("hocsinhId", hocsinhId);
		return "adminParent";
	}
	
	@RequestMapping(value="/admin/manage/{username}")
	public String managePage(){
		return "adminManage";
	}
}

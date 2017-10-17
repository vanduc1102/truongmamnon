package TDSchool.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.dao.RoleDAO;
import TDSchool.com.model.LoginAccount;
import TDSchool.com.model.RegisterAccount;
import TDSchool.com.validate.LoginAccountValidator;

@Controller
public class LoginAccountController {
	
	
	
	
	@Qualifier(value = "accountlogDao")
	private LoginAccountDAO accountlogDao;

		
	
	@Qualifier(value = "roleDao")
	private RoleDAO roleDao;
	
	
	
	
	
	

	@RequestMapping(value = "/host/profile/{name}")
	public ModelAndView hostAccount(@ModelAttribute("name") String name) {
		ModelAndView model = new ModelAndView("host");
		LoginAccount accountlog = this.accountlogDao.findAccountByName(name);
		model.addObject("AccountL", accountlog);
		model.addObject("user", accountlog.getUserName());
		model.addObject("email", accountlog.getEmailAddress());
		
		return model;
	}

	@RequestMapping(value = "/guest/profile/{name}")
	public ModelAndView guestAccount(@ModelAttribute("name") String name) {
		ModelAndView model = new ModelAndView("guest");
		LoginAccount accountlog = this.accountlogDao.findAccountByName(name);
		model.addObject("AccountL", accountlog);
		model.addObject("user", accountlog.getUserName());
		model.addObject("email", accountlog.getEmailAddress());
		return model;
	}
	
	
	@RequestMapping(value = "/mamnon/profile/{name}")
	public ModelAndView mamnonAccount(@ModelAttribute("name") String name) {
		ModelAndView model = new ModelAndView("mamnon");
		LoginAccount accountlog = this.accountlogDao.findAccountByName(name);
		model.addObject("AccountL", accountlog);
		model.addObject("user", accountlog.getUserName());
		model.addObject("email", accountlog.getEmailAddress());
		return model;
	}
	
	/*@RequestMapping(value = "/user/profile/{name}")
	public String userAccount(@ModelAttribute("name") String name, ModelMap model) {
		Account account = this.accountDao.findAccountByName(name);
		model.addAttribute("AccountL", account);
		model.addAttribute("user", account.getUserName());
		model.addAttribute("email", account.getEmailAddress());
		return "user";
	}*/
	@RequestMapping(value="/listAccount")
	public ModelAndView listAccount(){
		ModelAndView model = new ModelAndView("listAccount");
		List<LoginAccount> listAccs = this.accountlogDao.listAll();
		model.addObject("accountlogs", listAccs);
		return model;
	}
	
	
}

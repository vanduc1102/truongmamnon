package TDSchool.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import TDSchool.com.dao.HocsinhDAO;
import TDSchool.com.dao.RegisterAccountDAO;
import TDSchool.com.dao.RoleDAO;
import TDSchool.com.model.RegisterAccount;




@Controller
public class RegisterAccountController {

	@Autowired(required = true)
	@Qualifier(value = "accountDao")
	private RegisterAccountDAO accountDao;
	@Autowired(required=true)
	@Qualifier(value="HocsinhDao")
	private HocsinhDAO HocsinhDao;
	@Autowired(required=true)
	@Qualifier(value="RoleDao")
	private RoleDAO RoleDao;
	
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.password","Field is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConfirm", "required.passwordConfirm","Field is required");
		
		RegisterAccount acc = (RegisterAccount) target;
		
		if(!(acc.getPassword().equals(acc.getPasswordConfirm()))){
			errors.rejectValue("password","notmatch.password");
		}
		
		RegisterAccount username = accountDao.findByUsername(acc.getUsername());
		if(username!=null){
			errors.rejectValue("username","exist.username");
		}
	}

	// @InitBinder("Account")
	// public void initBinder(WebDataBinder webDataBinder){
	// webDataBinder.setValidator(accountValidator);
	// }

	@RequestMapping(value = "/account")
	public ModelAndView listAccount() {
		ModelAndView model = new ModelAndView("listAccount");
		model.addObject("accounts", this.accountDao.listAll());
		return model;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView registerPage() {
		ModelAndView model = new ModelAndView("registerPage");
		model.addObject("account", new RegisterAccount());
		return model;
	}

	@RequestMapping(value = "/doRegister", method = RequestMethod.POST)
	public String doRegister(@ModelAttribute("account") RegisterAccount acc, BindingResult result) {
		validate(acc, result);
		
		if (result.hasErrors()) {
			System.out.println(result.toString());
			return "registerPage";
		} else {
			acc.getR().setRoleId(2);
			this.accountDao.addAccount(acc);
			return "redirect:/login";
		}
	}
	
	@RequestMapping(value="/editAccount/{accountId}")
	public ModelAndView editPage(@PathVariable("accountId") int accountId){
		ModelAndView model = new ModelAndView("editRegister");
		model.addObject("editAccount", this.accountDao.findAccountById(accountId));
		model.addObject("ListRole", RoleDao.listRole());
		return model;
	}
	
	@RequestMapping(value="/updateAccount",method=RequestMethod.POST)
	public String update(@ModelAttribute RegisterAccount ra){
		ra.setPasswordConfirm(ra.getPassword());
		this.accountDao.updateAccount(ra);
		return "redirect:/account";
	}
	
	@RequestMapping(value="/removeAccount/{accountId}",method=RequestMethod.GET)
	public String delete(@PathVariable("accountId") int accountId){
		this.accountDao.removeAccount(accountId);
		return "redirect:/account";
	}
	
	
}

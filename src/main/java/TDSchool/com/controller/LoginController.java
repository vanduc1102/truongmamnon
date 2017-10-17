package TDSchool.com.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import TDSchool.com.dao.HocsinhDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.LoginAccount;

@Controller
public class LoginController {
	
	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String executeSecurity(ModelMap model, Principal principal, Authentication authentication) {
		
		String name = principal.getName();
		LoginAccount account = this.accountlogDao.findAccountByName(name);
		@SuppressWarnings("unchecked")
		List<LoginAccount> authen = (List<LoginAccount>) authentication.getAuthorities();
		model.addAttribute("username", name);
		model.addAttribute("fullname", account.getFullName());
		model.addAttribute("authority", authen);
		
		return "admin";
	}
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {

		return "login";

	}

	@RequestMapping(value = "/fail2login", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {

		model.addAttribute("error", "true");
		return "login";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {

		return "login";

	}
}

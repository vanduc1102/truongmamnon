package TDSchool.com.controller;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import TDSchool.com.dao.ChuansuckhoeDAO;
import TDSchool.com.dao.LichhdkhoitreDAO;
import TDSchool.com.dao.LichhdmaugiaoDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.dao.MonhocDAO;
import TDSchool.com.dao.RoleDAO;
import TDSchool.com.dao.ThucdontrongtuanDAO;
import TDSchool.com.model.LoginAccount;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired(required=true)
	@Qualifier(value="ThucdontrongtuanDao")
	private ThucdontrongtuanDAO ThucdontrongtuanDao;
	@Autowired(required=true)
	@Qualifier(value="LichhdkhoitreDao")
	private LichhdkhoitreDAO LichhdkhoitreDao;
	@Autowired(required=true)
	@Qualifier(value="LichhdmaugiaoDao")
	private LichhdmaugiaoDAO LichhdmaugiaoDao;
	@Autowired(required=true)
	@Qualifier(value="MonhocDao")
	private MonhocDAO MonhocDao;
	@Autowired(required=true)
	@Qualifier(value="ChuansuckhoeDao")
	private ChuansuckhoeDAO ChuansuckhoeDao;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/Gioithieu", method = RequestMethod.GET)
	public String Gioithieu(Locale locale, Model model) {
		logger.info("Welcome gioithieu! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Gioithieu";
	}
	
	
	@RequestMapping(value = "/Lienhe", method = RequestMethod.GET)
	public String Lienhe(Locale locale, Model model) {
		logger.info("Welcome lienhe! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Lienhe";
	}
	
	@RequestMapping(value = "/Cosovatchat", method = RequestMethod.GET)
	public String Cosovatchat(Locale locale, Model model) {
		logger.info("Welcome Cosovatchat! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Cosovatchat";
	}
	
	@RequestMapping(value = "/Hoatdongnhatruong", method = RequestMethod.GET)
	public String Hoatdongnhatruong(Locale locale, Model model) {
		logger.info("Welcome Hoatdongnhatruong! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Hoatdongnhatruong";
	}
	
	@RequestMapping(value = "/Sitemap", method = RequestMethod.GET)
	public String Sitemap(Locale locale, Model model) {
		logger.info("Welcome Sitemap! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Sitemap";
	}
	
	@RequestMapping(value = "/Gocchobe", method = RequestMethod.GET)
	public String Gocchobe(Locale locale, Model model) {
		logger.info("Welcome Gocchobe! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Gocchobe";
	}
	
	@RequestMapping(value = "/Ngonghinhtretho", method = RequestMethod.GET)
	public String Ngonghinhtretho(Locale locale, Model model) {
		logger.info("Welcome Ngonghinhtretho! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Ngonghinhtretho";
	}
	
	@RequestMapping(value = "/Tacpham", method = RequestMethod.GET)
	public String Tacpham(Locale locale, Model model) {
		logger.info("Welcome Tacpham! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Tacpham";
	}
	
	@RequestMapping(value = "/TDTT", method = RequestMethod.GET)
	public String TDTT(ModelMap model) {
		model.addAttribute("listThucDon", this.ThucdontrongtuanDao.listThucdontrongtuan());
		return "TDTT";
	}
	
	@RequestMapping(value = "/LHDKT", method = RequestMethod.GET)
	public String LHDKT(ModelMap model) {
		model.addAttribute("listHDKT", this.LichhdkhoitreDao.listLichhdkhoitre());
		return "LHDKT";
	}
	
	@RequestMapping(value = "/LHDMG", method = RequestMethod.GET)
	public String LHDMG(ModelMap model) {
		model.addAttribute("listHDMG", this.LichhdmaugiaoDao.listLichhdmaugiao());
		return "LHDMG";
	}
	@RequestMapping(value = "/MONHOC", method = RequestMethod.GET)
	public String MONHOC(ModelMap model) {
		model.addAttribute("listMONHOC", this.MonhocDao.listMonhoc());
		return "MONHOC";
	}
	@RequestMapping(value = "/CHUANSK", method = RequestMethod.GET)
	public String CHUANSK(ModelMap model) {
		model.addAttribute("listCHUANSK", this.ChuansuckhoeDao.listChuansuckhoe());
		return "CHUANSK";
	}
	
	@RequestMapping(value = "/Tuyendung", method = RequestMethod.GET)
	public String Tuyendung(Locale locale, Model model) {
		logger.info("Welcome Tuyendung! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Tuyendung";
	}
	
	

	
	@RequestMapping(value = "/sendmail", method = RequestMethod.GET)
	public String homeSendmail(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "sendmail";
	}
	
	@RequestMapping(value = "/send", method = RequestMethod.GET)
	public String homeSend(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "send";
	}
	
}

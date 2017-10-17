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


import TDSchool.com.dao.ChuansuckhoeDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.Chuansuckhoe;
import TDSchool.com.model.Chuansuckhoe;
import TDSchool.com.model.LoginAccount;

@Controller
public class ChuansuckhoeController {
	
	@Autowired(required=true)
	@Qualifier(value="ChuansuckhoeDao")
	private ChuansuckhoeDAO ChuansuckhoeDao;


	

	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;

	@RequestMapping(value="/admin/Chuansuckhoe")
	public ModelAndView listChuansuckhoe( ){
		List<Chuansuckhoe> listChuansuckhoes = ChuansuckhoeDao.listChuansuckhoe();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Chuansuckhoe/listChuansuckhoe");
		model.addObject("LChuansuckhoe",listChuansuckhoes);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Chuansuckhoe/New", method = RequestMethod.GET)
	public ModelAndView newChuansuckhoe(){
		ModelAndView model = new ModelAndView("admin/Chuansuckhoe/newChuansuckhoe");
		model.addObject("NChuansuckhoe", new Chuansuckhoe());

		return model;
	}
	
	@RequestMapping(value="/admin/Chuansuckhoe/Add", method=RequestMethod.POST)
	public String addChuansuckhoe(@ModelAttribute Chuansuckhoe prod){
		if(prod.getChuansuckhoeid() == 0){
			this.ChuansuckhoeDao.addChuansuckhoe(prod);
		}
		return "redirect:/admin/Chuansuckhoe";
	}
	
	@RequestMapping(value="/admin/Chuansuckhoe/Remove/{id}")
	public String removeChuansuckhoes(@PathVariable("id") int id){
		this.ChuansuckhoeDao.removeChuansuckhoe(id);
		return "redirect:/admin/Chuansuckhoe";
	}
	
	@RequestMapping(value="/admin/Chuansuckhoe/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editChuansuckhoe(@PathVariable("id") int id){
		Chuansuckhoe listChuansuckhoeById = ChuansuckhoeDao.findChuansuckhoe(id);
		ModelAndView model = new ModelAndView("admin/Chuansuckhoe/editChuansuckhoe");
		model.addObject("FChuansuckhoe",listChuansuckhoeById);

		return model;
	}
	
	@RequestMapping(value="/admin/Chuansuckhoe/Update", method=RequestMethod.POST)
	public String updateChuansuckhoe(@ModelAttribute Chuansuckhoe pro){
		if(pro.getChuansuckhoeid() != 0){
			this.ChuansuckhoeDao.updateChuansuckhoe(pro);
		}
		return "redirect:/admin/Chuansuckhoe";
	}
	
	@RequestMapping(value="/admin/Chuansuckhoe/Search")
	public ModelAndView searchChuansuckhoe(String searchString){
		List<Chuansuckhoe> listChuansuckhoes = ChuansuckhoeDao.searchForChuansuckhoe(searchString);
		ModelAndView model = new ModelAndView("admin/Chuansuckhoe/listChuansuckhoe");
		model.addObject("LChuansuckhoe",listChuansuckhoes);
		return model;
	}
}

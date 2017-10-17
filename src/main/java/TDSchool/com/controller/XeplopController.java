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


import TDSchool.com.dao.XeplopDAO;
import TDSchool.com.dao.BaomauDAO;
import TDSchool.com.dao.GiaovienDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.Xeplop;
import TDSchool.com.model.LoginAccount;
import TDSchool.com.model.Xeplop;

@Controller
public class XeplopController {
	
	@Autowired(required=true)
	@Qualifier(value="XeplopDao")
	private XeplopDAO XeplopDao;
	@Autowired(required=true)
	@Qualifier(value="BaomauDao")
	private BaomauDAO BaomauDao;
	@Autowired(required=true)
	@Qualifier(value="GiaovienDao")
	private GiaovienDAO GiaovienDao;

	

	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;

	@RequestMapping(value="/admin/Xeplop")
	public ModelAndView listXeplop(){
		List<Xeplop> listXeplops = XeplopDao.listXeplop();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Xeplop/listXeplop");
		model.addObject("LXeplop",listXeplops);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Xeplop/New", method = RequestMethod.GET)
	public ModelAndView newXeplop(){
		ModelAndView model = new ModelAndView("admin/Xeplop/newXeplop");
		model.addObject("NXeplop", new Xeplop());
		model.addObject("ListGiao", GiaovienDao.listGiaovien());
		model.addObject("ListBao", BaomauDao.listBaomau());
		return model;
	}
	
	@RequestMapping(value="/admin/Xeplop/Add", method=RequestMethod.POST)
	public String addXeplop(@ModelAttribute Xeplop prod){
		if(prod.getXeplopid() == 0){
			this.XeplopDao.addXeplop(prod);
		}
		return "redirect:/admin/Xeplop";
	}
	
	@RequestMapping(value="/admin/Xeplop/Remove/{id}")
	public String removeXeplops(@PathVariable("id") int id){
		this.XeplopDao.removeXeplop(id);
		return "redirect:/admin/Xeplop";
	}
	
	@RequestMapping(value="/admin/Xeplop/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editXeplop(@PathVariable("id") int id){
		Xeplop listXeplopById = XeplopDao.findXeplop(id);
		ModelAndView model = new ModelAndView("admin/Xeplop/editXeplop");
		model.addObject("FXeplop",listXeplopById);
		model.addObject("ListGiao", GiaovienDao.listGiaovien());
		model.addObject("ListBao", BaomauDao.listBaomau());
		return model;
	}
	
	@RequestMapping(value="/admin/Xeplop/Update", method=RequestMethod.POST)
	public String updateXeplop(@ModelAttribute Xeplop pro){
		if(pro.getXeplopid() != 0){
			this.XeplopDao.updateXeplop(pro);
		}
		return "redirect:/admin/Xeplop";
	}
	
	@RequestMapping(value="/admin/Xeplop/Search")
	public ModelAndView searchXeplop(String searchString){
		List<Xeplop> listXeplops = XeplopDao.searchForXeplop(searchString);
		ModelAndView model = new ModelAndView("admin/Xeplop/listXeplop");
		model.addObject("LXeplop",listXeplops);
		return model;
	}
}

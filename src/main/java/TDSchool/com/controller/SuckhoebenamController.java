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


import TDSchool.com.dao.SuckhoebenamDAO;
import TDSchool.com.dao.ChuansuckhoeDAO;
import TDSchool.com.dao.HocsinhDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.Chuansuckhoe;
import TDSchool.com.model.Suckhoebenam;
import TDSchool.com.model.LoginAccount;
import TDSchool.com.model.Suckhoebenam;

@Controller
public class SuckhoebenamController {
	
	@Autowired(required=true)
	@Qualifier(value="SuckhoebenamDao")
	private SuckhoebenamDAO SuckhoebenamDao;
	@Autowired(required=true)
	@Qualifier(value="HocsinhDao")
	private HocsinhDAO HocsinhDao;
	@Autowired(required=true)
	@Qualifier(value="ChuansuckhoeDao")
	private ChuansuckhoeDAO ChuansuckhoeDao;
	
	

	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;
	
	@RequestMapping(value="/admin/Suckhoebenam")
	public ModelAndView listSuckhoebenam(){
		List<Suckhoebenam> listSuckhoebenams = SuckhoebenamDao.listSuckhoebenam();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Suckhoebenam/listSuckhoebenam");
		model.addObject("LSuckhoebenam",listSuckhoebenams);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Suckhoebenam/New", method = RequestMethod.GET)
	public ModelAndView newSuckhoebenam(){
		ModelAndView model = new ModelAndView("admin/Suckhoebenam/newSuckhoebenam");
		model.addObject("NSuckhoebenam", new Suckhoebenam());
		model.addObject("ListHoc", HocsinhDao.listHocsinh());
		model.addObject("ListChuan", ChuansuckhoeDao.listChuansuckhoe());
		List<Chuansuckhoe> listChuansuckhoes = ChuansuckhoeDao.listChuansuckhoe();
		model.addObject("LChuansuckhoe",listChuansuckhoes);

		return model;
	}
	
	@RequestMapping(value="/admin/Suckhoebenam/Add", method=RequestMethod.POST)
	public String addSuckhoebenam(@ModelAttribute Suckhoebenam prod){
		if(prod.getSuckhoebenamid() == 0){
			this.SuckhoebenamDao.addSuckhoebenam(prod);
		}
		return "redirect:/admin/Suckhoebenam";
	}
	
	@RequestMapping(value="/admin/Suckhoebenam/Remove/{id}")
	public String removeSuckhoebenams(@PathVariable("id") int id){
		this.SuckhoebenamDao.removeSuckhoebenam(id);
		return "redirect:/admin/Suckhoebenam";
	}
	
	@RequestMapping(value="/admin/Suckhoebenam/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editSuckhoebenam(@PathVariable("id") int id){
		Suckhoebenam listSuckhoebenamById = SuckhoebenamDao.findSuckhoebenam(id);
		ModelAndView model = new ModelAndView("admin/Suckhoebenam/editSuckhoebenam");
		model.addObject("FSuckhoebenam",listSuckhoebenamById);
		model.addObject("ListHoc", HocsinhDao.listHocsinh());
		model.addObject("ListChuan", ChuansuckhoeDao.listChuansuckhoe());
		return model;
	}
	
	@RequestMapping(value="/admin/Suckhoebenam/Update", method=RequestMethod.POST)
	public String updateSuckhoebenam(@ModelAttribute Suckhoebenam pro){
		if(pro.getSuckhoebenamid() != 0){
			this.SuckhoebenamDao.updateSuckhoebenam(pro);
		}
		return "redirect:/admin/Suckhoebenam";
	}
	
	@RequestMapping(value="/admin/Suckhoebenam/Search")
	public ModelAndView searchSuckhoebenam(String searchString){
		List<Suckhoebenam> listSuckhoebenams = SuckhoebenamDao.searchForSuckhoebenam(searchString);
		ModelAndView model = new ModelAndView("admin/Suckhoebenam/listSuckhoebenam");
		model.addObject("LSuckhoebenam",listSuckhoebenams);
		return model;
	}
}

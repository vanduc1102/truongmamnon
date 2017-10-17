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

import TDSchool.com.dao.HocsinhDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.dao.ThuchiDAO;
import TDSchool.com.model.Thuchi;


@Controller
public class ThuchiController {
	
	@Autowired(required=true)
	@Qualifier(value="ThuchiDao")
	private ThuchiDAO ThuchiDao;
	@Autowired(required=true)
	@Qualifier(value="HocsinhDao")
	private HocsinhDAO HocsinhDao;


	@RequestMapping(value="/admin/Thuchi")
	public ModelAndView listThuchi(){
		List<Thuchi> listThuchis = ThuchiDao.listThuchi();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Thuchi/listThuchi");
		model.addObject("LThuchi",listThuchis);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Thuchi/New", method = RequestMethod.GET)
	public ModelAndView newThuchi(){
		ModelAndView model = new ModelAndView("admin/Thuchi/newThuchi");
		model.addObject("NThuchi", new Thuchi());
		model.addObject("ListHoc", HocsinhDao.listHocsinh());
		return model;
	}
	
	@RequestMapping(value="/admin/Thuchi/Add", method=RequestMethod.POST)
	public String addThuchi(@ModelAttribute Thuchi prod){
		if(prod.getThuchiid() == 0){
			this.ThuchiDao.addThuchi(prod);
		}
		return "redirect:/admin/Thuchi";
	}
	
	@RequestMapping(value="/admin/Thuchi/Remove/{id}")
	public String removeThuchis(@PathVariable("id") int id){
		this.ThuchiDao.removeThuchi(id);
		return "redirect:/admin/Thuchi";
	}
	
	@RequestMapping(value="/admin/Thuchi/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editThuchi(@PathVariable("id") int id){
		Thuchi listThuchiById = ThuchiDao.findThuchi(id);
		ModelAndView model = new ModelAndView("admin/Thuchi/editThuchi");
		model.addObject("FThuchi",listThuchiById);
		model.addObject("ListHoc", HocsinhDao.listHocsinh());
		return model;
	}
	
	@RequestMapping(value="/admin/Thuchi/Update", method=RequestMethod.POST)
	public String updateThuchi(@ModelAttribute Thuchi pro){
		if(pro.getThuchiid() != 0){
			this.ThuchiDao.updateThuchi(pro);
		}
		return "redirect:/admin/Thuchi";
	}
	
	@RequestMapping(value="/admin/Thuchi/Search")
	public ModelAndView searchThuchi(String searchString){
		List<Thuchi> listThuchis = ThuchiDao.searchForThuchi(searchString);
		ModelAndView model = new ModelAndView("admin/Thuchi/listThuchi");
		model.addObject("LThuchi",listThuchis);
		return model;
	}
}

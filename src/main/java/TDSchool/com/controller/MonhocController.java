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

import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.dao.MonhocDAO;
import TDSchool.com.model.Monhoc;
import TDSchool.com.model.LoginAccount;
import TDSchool.com.model.Monhoc;

@Controller
public class MonhocController {
	
	@Autowired(required=true)
	@Qualifier(value="MonhocDao")
	private MonhocDAO MonhocDao;



	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;

	@RequestMapping(value="/admin/Monhoc")
	public ModelAndView listMonhoc(){
		List<Monhoc> listMonhocs = MonhocDao.listMonhoc();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Monhoc/listMonhoc");
		model.addObject("LMonhoc",listMonhocs);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Monhoc/New", method = RequestMethod.GET)
	public ModelAndView newMonhoc(){
		ModelAndView model = new ModelAndView("admin/Monhoc/newMonhoc");
		model.addObject("NMonhoc", new Monhoc());

		return model;
	}
	
	@RequestMapping(value="/admin/Monhoc/Add", method=RequestMethod.POST)
	public String addMonhoc(@ModelAttribute Monhoc prod){
		if(prod.getMonhocid() == 0){
			this.MonhocDao.addMonhoc(prod);
		}
		return "redirect:/admin/Monhoc";
	}
	
	@RequestMapping(value="/admin/Monhoc/Remove/{id}")
	public String removeMonhocs(@PathVariable("id") int id){
		this.MonhocDao.removeMonhoc(id);
		return "redirect:/admin/Monhoc";
	}
	
	@RequestMapping(value="/admin/Monhoc/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editMonhoc(@PathVariable("id") int id){
		Monhoc listMonhocById = MonhocDao.findMonhoc(id);
		ModelAndView model = new ModelAndView("admin/Monhoc/editMonhoc");
		model.addObject("FMonhoc",listMonhocById);

		return model;
	}
	
	@RequestMapping(value="/admin/Monhoc/Update", method=RequestMethod.POST)
	public String updateMonhoc(@ModelAttribute Monhoc pro){
		if(pro.getMonhocid() != 0){
			this.MonhocDao.updateMonhoc(pro);
		}
		return "redirect:/admin/Monhoc";
	}
	
	@RequestMapping(value="/admin/Monhoc/Search")
	public ModelAndView searchMonhoc(String searchString){
		List<Monhoc> listMonhocs = MonhocDao.searchForMonhoc(searchString);
		ModelAndView model = new ModelAndView("admin/Monhoc/listMonhoc");
		model.addObject("LMonhoc",listMonhocs);
		return model;
	}
}

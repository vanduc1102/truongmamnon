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


import TDSchool.com.dao.LichhdkhoitreDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.Lichhdkhoitre;
import TDSchool.com.model.Lichhdkhoitre;
import TDSchool.com.model.LoginAccount;

@Controller
public class LichhdkhoitreController {
	
	@Autowired(required=true)
	@Qualifier(value="LichhdkhoitreDao")
	private LichhdkhoitreDAO LichhdkhoitreDao;

	

	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;

	@RequestMapping(value="/admin/Lichhdkhoitre")
	public ModelAndView listLichhdkhoitre(){
		List<Lichhdkhoitre> listLichhdkhoitres = LichhdkhoitreDao.listLichhdkhoitre();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Lichhdkhoitre/listLichhdkhoitre");
		model.addObject("LLichhdkhoitre",listLichhdkhoitres);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Lichhdkhoitre/New", method = RequestMethod.GET)
	public ModelAndView newLichhdkhoitre(){
		ModelAndView model = new ModelAndView("admin/Lichhdkhoitre/newLichhdkhoitre");
		model.addObject("NLichhdkhoitre", new Lichhdkhoitre());

		return model;
	}
	
	@RequestMapping(value="/admin/Lichhdkhoitre/Add", method=RequestMethod.POST)
	public String addLichhdkhoitre(@ModelAttribute Lichhdkhoitre prod){
		if(prod.getLichhdkhoitreid() == 0){
			this.LichhdkhoitreDao.addLichhdkhoitre(prod);
		}
		return "redirect:/admin/Lichhdkhoitre";
	}
	
	@RequestMapping(value="/admin/Lichhdkhoitre/Remove/{id}")
	public String removeLichhdkhoitres(@PathVariable("id") int id){
		this.LichhdkhoitreDao.removeLichhdkhoitre(id);
		return "redirect:/admin/Lichhdkhoitre";
	}
	
	@RequestMapping(value="/admin/Lichhdkhoitre/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editLichhdkhoitre(@PathVariable("id") int id){
		Lichhdkhoitre listLichhdkhoitreById = LichhdkhoitreDao.findLichhdkhoitre(id);
		ModelAndView model = new ModelAndView("admin/Lichhdkhoitre/editLichhdkhoitre");
		model.addObject("FLichhdkhoitre",listLichhdkhoitreById);

		return model;
	}
	
	@RequestMapping(value="/admin/Lichhdkhoitre/Update", method=RequestMethod.POST)
	public String updateLichhdkhoitre(@ModelAttribute Lichhdkhoitre pro){
		if(pro.getLichhdkhoitreid() != 0){
			this.LichhdkhoitreDao.updateLichhdkhoitre(pro);
		}
		return "redirect:/admin/Lichhdkhoitre";
	}
	
	@RequestMapping(value="/admin/Lichhdkhoitre/Search")
	public ModelAndView searchLichhdkhoitre(String searchString){
		List<Lichhdkhoitre> listLichhdkhoitres = LichhdkhoitreDao.searchForLichhdkhoitre(searchString);
		ModelAndView model = new ModelAndView("admin/Lichhdkhoitre/listLichhdkhoitre");
		model.addObject("LLichhdkhoitre",listLichhdkhoitres);
		return model;
	}
}

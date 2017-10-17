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


import TDSchool.com.dao.LichhdmaugiaoDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.Lichhdmaugiao;
import TDSchool.com.model.Lichhdmaugiao;
import TDSchool.com.model.LoginAccount;

@Controller
public class LichhdmaugiaoController {
	
	@Autowired(required=true)
	@Qualifier(value="LichhdmaugiaoDao")
	private LichhdmaugiaoDAO LichhdmaugiaoDao;

	

	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;

	@RequestMapping(value="/admin/Lichhdmaugiao")
	public ModelAndView listLichhdmaugiao(){
		List<Lichhdmaugiao> listLichhdmaugiaos = LichhdmaugiaoDao.listLichhdmaugiao();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Lichhdmaugiao/listLichhdmaugiao");
		model.addObject("LLichhdmaugiao",listLichhdmaugiaos);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Lichhdmaugiao/New", method = RequestMethod.GET)
	public ModelAndView newLichhdmaugiao(){
		ModelAndView model = new ModelAndView("admin/Lichhdmaugiao/newLichhdmaugiao");
		model.addObject("NLichhdmaugiao", new Lichhdmaugiao());

		return model;
	}
	
	@RequestMapping(value="/admin/Lichhdmaugiao/Add", method=RequestMethod.POST)
	public String addLichhdmaugiao(@ModelAttribute Lichhdmaugiao prod){
		if(prod.getLichhdmaugiaoid() == 0){
			this.LichhdmaugiaoDao.addLichhdmaugiao(prod);
		}
		return "redirect:/admin/Lichhdmaugiao";
	}
	
	@RequestMapping(value="/admin/Lichhdmaugiao/Remove/{id}")
	public String removeLichhdmaugiaos(@PathVariable("id") int id){
		this.LichhdmaugiaoDao.removeLichhdmaugiao(id);
		return "redirect:/admin/Lichhdmaugiao";
	}
	
	@RequestMapping(value="/admin/Lichhdmaugiao/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editLichhdmaugiao(@PathVariable("id") int id){
		Lichhdmaugiao listLichhdmaugiaoById = LichhdmaugiaoDao.findLichhdmaugiao(id);
		ModelAndView model = new ModelAndView("admin/Lichhdmaugiao/editLichhdmaugiao");
		model.addObject("FLichhdmaugiao",listLichhdmaugiaoById);

		return model;
	}
	
	@RequestMapping(value="/admin/Lichhdmaugiao/Update", method=RequestMethod.POST)
	public String updateLichhdmaugiao(@ModelAttribute Lichhdmaugiao pro){
		if(pro.getLichhdmaugiaoid() != 0){
			this.LichhdmaugiaoDao.updateLichhdmaugiao(pro);
		}
		return "redirect:/admin/Lichhdmaugiao";
	}
	
	@RequestMapping(value="/admin/Lichhdmaugiao/Search")
	public ModelAndView searchLichhdmaugiao(String searchString){
		List<Lichhdmaugiao> listLichhdmaugiaos = LichhdmaugiaoDao.searchForLichhdmaugiao(searchString);
		ModelAndView model = new ModelAndView("admin/Lichhdmaugiao/listLichhdmaugiao");
		model.addObject("LLichhdmaugiao",listLichhdmaugiaos);
		return model;
	}
}

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
import TDSchool.com.dao.ThucdontrongtuanDAO;
import TDSchool.com.model.Thucdontrongtuan;

@Controller
public class ThucdontrongtuanController {
	
	@Autowired(required=true)
	@Qualifier(value="ThucdontrongtuanDao")
	private ThucdontrongtuanDAO ThucdontrongtuanDao;



	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;

	@RequestMapping(value="/admin/Thucdontrongtuan")
	public ModelAndView listThucdontrongtuan(){
		List<Thucdontrongtuan> listThucdontrongtuans = ThucdontrongtuanDao.listThucdontrongtuan();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Thucdontrongtuan/listThucdontrongtuan");
		model.addObject("LThucdontrongtuan",listThucdontrongtuans);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/TDTT")
	public ModelAndView listThucdontrongtuan1(){
		List<Thucdontrongtuan> listThucdontrongtuans = ThucdontrongtuanDao.listThucdontrongtuan();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Thucdontrongtuan/listThucdontrongtuan");
		model.addObject("LThucdontrongtuan1",listThucdontrongtuans);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Thucdontrongtuan/New", method = RequestMethod.GET)
	public ModelAndView newThucdontrongtuan(){
		ModelAndView model = new ModelAndView("admin/Thucdontrongtuan/newThucdontrongtuan");
		model.addObject("NThucdontrongtuan", new Thucdontrongtuan());

		return model;
	}
	
	@RequestMapping(value="/admin/Thucdontrongtuan/Add", method=RequestMethod.POST)
	public String addThucdontrongtuan(@ModelAttribute Thucdontrongtuan prod){
		if(prod.getThucdontrongtuanid() == 0){
			this.ThucdontrongtuanDao.addThucdontrongtuan(prod);
		}
		return "redirect:/admin/Thucdontrongtuan";
	}
	
	@RequestMapping(value="/admin/Thucdontrongtuan/Remove/{id}")
	public String removeThucdontrongtuans(@PathVariable("id") int id){
		this.ThucdontrongtuanDao.removeThucdontrongtuan(id);
		return "redirect:/admin/Thucdontrongtuan";
	}
	
	@RequestMapping(value="/admin/Thucdontrongtuan/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editThucdontrongtuan(@PathVariable("id") int id){
		Thucdontrongtuan listThucdontrongtuanById = ThucdontrongtuanDao.findThucdontrongtuan(id);
		ModelAndView model = new ModelAndView("admin/Thucdontrongtuan/editThucdontrongtuan");
		model.addObject("FThucdontrongtuan",listThucdontrongtuanById);

		return model;
	}
	
	@RequestMapping(value="/admin/Thucdontrongtuan/Update", method=RequestMethod.POST)
	public String updateThucdontrongtuan(@ModelAttribute Thucdontrongtuan pro){
		if(pro.getThucdontrongtuanid() != 0){
			this.ThucdontrongtuanDao.updateThucdontrongtuan(pro);
		}
		return "redirect:/admin/Thucdontrongtuan";
	}
	
	@RequestMapping(value="/admin/Thucdontrongtuan/Search")
	public ModelAndView searchThucdontrongtuan(String searchString){
		List<Thucdontrongtuan> listThucdontrongtuans = ThucdontrongtuanDao.searchForThucdontrongtuan(searchString);
		ModelAndView model = new ModelAndView("admin/Thucdontrongtuan/listThucdontrongtuan");
		model.addObject("LThucdontrongtuan",listThucdontrongtuans);
		return model;
	}
}

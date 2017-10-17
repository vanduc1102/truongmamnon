package TDSchool.com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import TDSchool.com.dao.HocsinhDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.dao.LopDAO;
import TDSchool.com.dao.XeplopDAO;
import TDSchool.com.model.Hocsinh;
import TDSchool.com.model.LoginAccount;

@Controller
public class HocsinhController {
	
	@Autowired(required=true)
	@Qualifier(value="HocsinhDao")
	private HocsinhDAO HocsinhDao;
		

	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;

	@RequestMapping(value="/admin/Hocsinh")
	public ModelAndView listHocsinh(){
		List<Hocsinh> listHocsinhs = HocsinhDao.listHocsinh();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Hocsinh/listHocsinh");
		model.addObject("LHocsinh",listHocsinhs);
		//model.addObject("fullname",account.getFullName());
		return model;
	}

	
	@RequestMapping(value="/admin/Hocsinh/New", method = RequestMethod.GET)
	public ModelAndView newHocsinh(){
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Hocsinh/newHocsinh");
		model.addObject("NHocsinh", new Hocsinh());
		
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Hocsinh/Add", method=RequestMethod.POST)
	public String addHocsinh(@RequestParam("hinhanhUpload") CommonsMultipartFile[] hinhanhUpload, @ModelAttribute Hocsinh prod){
		if (hinhanhUpload != null && hinhanhUpload.length > 0) {
			for (CommonsMultipartFile aFile : hinhanhUpload) {
				
				String filePath = "C:\\workspace\\PreSchoolManagementSystem\\src\\main\\webapp\\resources\\home\\img\\people\\";
				try {
					if (!aFile.getOriginalFilename().equals("")) {
						aFile.transferTo(new File(filePath + aFile.getOriginalFilename()));
						prod.setHinhanh(aFile.getOriginalFilename());
                  					}
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		this.HocsinhDao.addHocsinh(prod);
		
		return "redirect:/admin/Hocsinh";
	}
	
	@RequestMapping(value="/admin/Hocsinh/Remove/{id}")
	public String removeHocsinhs(@PathVariable("id") int id){
		this.HocsinhDao.removeHocsinh(id);
		return "redirect:/admin/Hocsinh";
	}
	
	@RequestMapping(value="/admin/Hocsinh/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editHocsinh(@PathVariable("id") int id){
		Hocsinh listHocsinhById = HocsinhDao.findHocsinh(id);
		ModelAndView model = new ModelAndView("admin/Hocsinh/editHocsinh");
		model.addObject("FHocsinh",listHocsinhById);
		
		model.addObject("hinhanh",listHocsinhById.getHinhanh());

		return model;
	}
	
	@RequestMapping(value="/admin/Hocsinh/Update", method=RequestMethod.POST)
	public String updateHocsinh(@RequestParam("hinhanhUpload") CommonsMultipartFile[] hinhanhUpload, @ModelAttribute Hocsinh prod){
			
		if (hinhanhUpload != null && hinhanhUpload.length > 0) {
			for (CommonsMultipartFile aFile : hinhanhUpload) {
				String filePath = "C:\\workspace\\PreSchoolManagementSystem\\src\\main\\webapp\\resources\\home\\img\\people\\";
				try {
					if (!aFile.getOriginalFilename().equals("")) {
						aFile.transferTo(new File(filePath + aFile.getOriginalFilename()));
						prod.setHinhanh(aFile.getOriginalFilename());
						this.HocsinhDao.updateHocsinh(prod);

					}
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		this.HocsinhDao.updateHocsinh(prod);
		return "redirect:/admin/Hocsinh";
	}
	
	@RequestMapping(value="/admin/Hocsinh/Search")
	public ModelAndView searchHocsinh(String searchString){
		List<Hocsinh> listHocsinhs = HocsinhDao.searchForHocsinh(searchString);
		ModelAndView model = new ModelAndView("admin/Hocsinh/listHocsinh");
		model.addObject("LHocsinh",listHocsinhs);
		return model;
	}
	
	
	
	
}

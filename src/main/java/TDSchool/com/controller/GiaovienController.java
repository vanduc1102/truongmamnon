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

import TDSchool.com.dao.GiaovienDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.Giaovien;
import TDSchool.com.model.Giaovien;
import TDSchool.com.model.LoginAccount;

@Controller
public class GiaovienController {
	
	@Autowired(required=true)
	@Qualifier(value="GiaovienDao")
	private GiaovienDAO GiaovienDao;
	
	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;
	
	@RequestMapping(value="/admin/Giaovien")
	public ModelAndView listGiaovien(){
		List<Giaovien> listGiaoviens = GiaovienDao.listGiaovien();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Giaovien/listGiaovien");
		model.addObject("LGiaovien",listGiaoviens);
		//model.addObject("fullname",account.getFullName());
		return model;
	}

	
	
	@RequestMapping(value="/admin/Giaovien/New", method = RequestMethod.GET)
	public ModelAndView newGiaovien(){
		ModelAndView model = new ModelAndView("admin/Giaovien/newGiaovien");
		model.addObject("NGiaovien", new Giaovien());

		return model;
	}
	
	@RequestMapping(value="/admin/Giaovien/Add", method=RequestMethod.POST)
	public String addGiaovien(@RequestParam("hinhanhUpload") CommonsMultipartFile[] hinhanhUpload, @ModelAttribute Giaovien prod){
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
		this.GiaovienDao.addGiaovien(prod);
		
		return "redirect:/admin/Giaovien";
	}
	
	@RequestMapping(value="/admin/Giaovien/Remove/{id}")
	public String removeGiaoviens(@PathVariable("id") int id){
		this.GiaovienDao.removeGiaovien(id);
		return "redirect:/admin/Giaovien";
	}
	
	@RequestMapping(value="/admin/Giaovien/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editGiaovien(@PathVariable("id") int id){
		Giaovien listGiaovienById = GiaovienDao.findGiaovien(id);
		ModelAndView model = new ModelAndView("admin/Giaovien/editGiaovien");
		model.addObject("FGiaovien",listGiaovienById);
		model.addObject("hinhanh",listGiaovienById.getHinhanh());
		return model;
	}
	
	@RequestMapping(value="/admin/Giaovien/Update", method=RequestMethod.POST)
	public String updateGiaovien(@RequestParam("hinhanhUpload") CommonsMultipartFile[] hinhanhUpload, @ModelAttribute Giaovien prod){
			
		if (hinhanhUpload != null && hinhanhUpload.length > 0) {
			for (CommonsMultipartFile aFile : hinhanhUpload) {
				String filePath = "C:\\workspace\\PreSchoolManagementSystem\\src\\main\\webapp\\resources\\home\\img\\people\\";
				try {
					if (!aFile.getOriginalFilename().equals("")) {
						aFile.transferTo(new File(filePath + aFile.getOriginalFilename()));
						prod.setHinhanh(aFile.getOriginalFilename());
						this.GiaovienDao.updateGiaovien(prod);

					}
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		this.GiaovienDao.updateGiaovien(prod);
		return "redirect:/admin/Giaovien";
	}
	
	@RequestMapping(value="/admin/Giaovien/Search")
	public ModelAndView searchGiaovien(String searchString){
		List<Giaovien> listGiaoviens = GiaovienDao.searchForGiaovien(searchString);
		ModelAndView model = new ModelAndView("admin/Giaovien/listGiaovien");
		model.addObject("LGiaovien",listGiaoviens);
		return model;
	}
}

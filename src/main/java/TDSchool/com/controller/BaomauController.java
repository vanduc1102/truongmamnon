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


import TDSchool.com.dao.BaomauDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.model.Baomau;
import TDSchool.com.model.Baomau;
import TDSchool.com.model.LoginAccount;
import TDSchool.com.model.Baomau;
import TDSchool.com.model.Baomau;

@Controller
public class BaomauController {
	
	@Autowired(required=true)
	@Qualifier(value="BaomauDao")
	private BaomauDAO BaomauDao;



	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;

	@RequestMapping(value="/admin/Baomau")
	public ModelAndView listBaomau(){
		List<Baomau> listBaomaus = BaomauDao.listBaomau();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Baomau/listBaomau");
		model.addObject("LBaomau",listBaomaus);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/admin/Baomau/New", method = RequestMethod.GET)
	public ModelAndView newBaomau(){
		ModelAndView model = new ModelAndView("admin/Baomau/newBaomau");
		model.addObject("NBaomau", new Baomau());

		return model;
	}
	
	@RequestMapping(value="/admin/Baomau/Add", method=RequestMethod.POST)
	public String addBaomau(@RequestParam("hinhanhUpload") CommonsMultipartFile[] hinhanhUpload, @ModelAttribute Baomau prod){
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
		this.BaomauDao.addBaomau(prod);
		
		return "redirect:/admin/Baomau";
	}
	
	@RequestMapping(value="/admin/Baomau/Remove/{id}")
	public String removeBaomaus(@PathVariable("id") int id){
		this.BaomauDao.removeBaomau(id);
		return "redirect:/admin/Baomau";
	}
	
	@RequestMapping(value="/admin/Baomau/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editBaomau(@PathVariable("id") int id){
		Baomau listBaomauById = BaomauDao.findBaomau(id);
		ModelAndView model = new ModelAndView("admin/Baomau/editBaomau");
		model.addObject("FBaomau",listBaomauById);
		model.addObject("hinhanh",listBaomauById.getHinhanh());
		return model;
	}
	
	@RequestMapping(value="/admin/Baomau/Update", method=RequestMethod.POST)
	public String updateBaomau(@RequestParam("hinhanhUpload") CommonsMultipartFile[] hinhanhUpload, @ModelAttribute Baomau prod){
			
		if (hinhanhUpload != null && hinhanhUpload.length > 0) {
			for (CommonsMultipartFile aFile : hinhanhUpload) {
				String filePath = "C:\\workspace\\PreSchoolManagementSystem\\src\\main\\webapp\\resources\\home\\img\\people\\";
				try {
					if (!aFile.getOriginalFilename().equals("")) {
						aFile.transferTo(new File(filePath + aFile.getOriginalFilename()));
						prod.setHinhanh(aFile.getOriginalFilename());
						this.BaomauDao.updateBaomau(prod);

					}
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		this.BaomauDao.updateBaomau(prod);
		return "redirect:/admin/Baomau";
	}
	
	@RequestMapping(value="/admin/Baomau/Search")
	public ModelAndView searchBaomau(String searchString){
		List<Baomau> listBaomaus = BaomauDao.searchForBaomau(searchString);
		ModelAndView model = new ModelAndView("admin/Baomau/listBaomau");
		model.addObject("LBaomau",listBaomaus);
		return model;
	}
}

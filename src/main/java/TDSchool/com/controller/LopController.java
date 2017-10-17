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

import TDSchool.com.dao.BaomauDAO;
import TDSchool.com.dao.GiaovienDAO;
import TDSchool.com.dao.HocsinhDAO;
import TDSchool.com.dao.LoginAccountDAO;
import TDSchool.com.dao.LopDAO;
import TDSchool.com.dao.XeplopDAO;
import TDSchool.com.model.Baomau;
import TDSchool.com.model.Giaovien;
import TDSchool.com.model.Hocsinh;
import TDSchool.com.model.LoginAccount;
import TDSchool.com.model.Lop;
import TDSchool.com.model.Xeplop;

@Controller
public class LopController {
	
	@Autowired(required=true)
	@Qualifier(value="LopDao")
	private LopDAO LopDao;
	@Autowired(required=true)
	@Qualifier(value="XeplopDao")
	private XeplopDAO XeplopDao;
	@Autowired(required=true)
	@Qualifier(value="HocsinhDao")
	private HocsinhDAO HocsinhDao;
	@Autowired(required=true)
	@Qualifier(value="GiaovienDao")
	private GiaovienDAO GiaovienDao;
	@Autowired(required=true)
	@Qualifier(value="BaomauDao")
	private BaomauDAO BaomauDao;


	@Autowired(required=true)
	@Qualifier(value="accountlogDao")
	private LoginAccountDAO accountlogDao;
	
	

	@RequestMapping(value="/admin/Lop")
	public ModelAndView listLop(){
		List<Lop> listLops = LopDao.listLop();
		//LoginAccount account  = this.accountlogDao.findAccountByName(username);
		ModelAndView model = new ModelAndView("admin/Lop/listLop");
		model.addObject("LLop",listLops);
		//model.addObject("fullname",account.getFullName());
		return model;
	}
	
	@RequestMapping(value="/detailHocsinh/{hocsinhId}")
	public ModelAndView detailHocsinh(@PathVariable("hocsinhId") int hocsinhId){
		ModelAndView model = new ModelAndView("detailHocsinh");
		model.addObject("detailHs",this.LopDao.detailHocsinhById(hocsinhId));
		return model;
	}
	
// Danh sách các lớp
	@RequestMapping(value="/Danhsachlopchoi/{xepId}")
	public ModelAndView Danhsachlopchoi(@PathVariable("xepId") int xepId){
		ModelAndView model = new ModelAndView("Danhsachlopla");
		Xeplop xl = this.XeplopDao.findXeplop(xepId);
		int giaovienId = xl.getGiaovien().getGiaovienid();
		Giaovien gv = this.GiaovienDao.findGiaovien(giaovienId);
		model.addObject("LLop",this.LopDao.listLopTheoId(xepId));
		model.addObject("hinhanhGiaovien", gv.getHinhanh());
		model.addObject("tengiaovien", gv.getTengv());
		
		int baomauId = xl.getBaomau().getBaomauid();
		Baomau bm = this.BaomauDao.findBaomau(baomauId);
		model.addObject("LLop",this.LopDao.listLopTheoId(xepId));
		model.addObject("hinhanhBaomau", bm.getHinhanh());
		model.addObject("tenbaomau", bm.getTenbaomau());
		
		return model;
	}
	@RequestMapping(value="/Danhsachlopbe/{xepId}")
	public ModelAndView Danhsachlopbe(@PathVariable("xepId") int xepId){
		ModelAndView model = new ModelAndView("Danhsachlopla");
		Xeplop xl = this.XeplopDao.findXeplop(xepId);
		int giaovienId = xl.getGiaovien().getGiaovienid();
		Giaovien gv = this.GiaovienDao.findGiaovien(giaovienId);
		model.addObject("LLop",this.LopDao.listLopTheoId(xepId));
		model.addObject("hinhanhGiaovien", gv.getHinhanh());
		model.addObject("tengiaovien", gv.getTengv());
		
		int baomauId = xl.getBaomau().getBaomauid();
		Baomau bm = this.BaomauDao.findBaomau(baomauId);
		model.addObject("LLop",this.LopDao.listLopTheoId(xepId));
		model.addObject("hinhanhBaomau", bm.getHinhanh());
		model.addObject("tenbaomau", bm.getTenbaomau());
		
		return model;
	}
	@RequestMapping(value="/Danhsachloptre/{xepId}")
	public ModelAndView Danhsachloptre(@PathVariable("xepId") int xepId){
		ModelAndView model = new ModelAndView("Danhsachlopla");
		Xeplop xl = this.XeplopDao.findXeplop(xepId);
		int giaovienId = xl.getGiaovien().getGiaovienid();
		Giaovien gv = this.GiaovienDao.findGiaovien(giaovienId);
		model.addObject("LLop",this.LopDao.listLopTheoId(xepId));
		model.addObject("hinhanhGiaovien", gv.getHinhanh());
		model.addObject("tengiaovien", gv.getTengv());
		
		int baomauId = xl.getBaomau().getBaomauid();
		Baomau bm = this.BaomauDao.findBaomau(baomauId);
		model.addObject("LLop",this.LopDao.listLopTheoId(xepId));
		model.addObject("hinhanhBaomau", bm.getHinhanh());
		model.addObject("tenbaomau", bm.getTenbaomau());
		
		return model;
	}
	@RequestMapping(value="/Danhsachlopmam/{xepId}")
	public ModelAndView Danhsachlopmam(@PathVariable("xepId") int xepId){
		ModelAndView model = new ModelAndView("Danhsachlopla");
		Xeplop xl = this.XeplopDao.findXeplop(xepId);
		int giaovienId = xl.getGiaovien().getGiaovienid();
		Giaovien gv = this.GiaovienDao.findGiaovien(giaovienId);
		model.addObject("LLop",this.LopDao.listLopTheoId(xepId));
		model.addObject("hinhanhGiaovien", gv.getHinhanh());
		model.addObject("tengiaovien", gv.getTengv());
		
		int baomauId = xl.getBaomau().getBaomauid();
		Baomau bm = this.BaomauDao.findBaomau(baomauId);
		model.addObject("LLop",this.LopDao.listLopTheoId(xepId));
		model.addObject("hinhanhBaomau", bm.getHinhanh());
		model.addObject("tenbaomau", bm.getTenbaomau());
		
		return model;
	}
	@RequestMapping(value="/Danhsachlopla/{xepId}")
	public ModelAndView Danhsachlopla(@PathVariable("xepId") int xepId){
		ModelAndView model = new ModelAndView("Danhsachlopla");
		Xeplop xl = this.XeplopDao.findXeplop(xepId);
		int giaovienId = xl.getGiaovien().getGiaovienid();
		Giaovien gv = this.GiaovienDao.findGiaovien(giaovienId);
		model.addObject("LLop",this.LopDao.listLopTheoId(xepId));
		model.addObject("hinhanhGiaovien", gv.getHinhanh());
		model.addObject("tengiaovien", gv.getTengv());
		
		int baomauId = xl.getBaomau().getBaomauid();
		Baomau bm = this.BaomauDao.findBaomau(baomauId);
		model.addObject("LLop",this.LopDao.listLopTheoId(xepId));
		model.addObject("hinhanhBaomau", bm.getHinhanh());
		model.addObject("tenbaomau", bm.getTenbaomau());
		
		return model;
	}
// Kết thúc Danh sách các lớp
	
	
	@RequestMapping(value="/admin/Lop/New", method = RequestMethod.GET)
	public ModelAndView newLop(){
		ModelAndView model = new ModelAndView("admin/Lop/newLop");
		model.addObject("NLop", new Lop());
		model.addObject("ListXep", XeplopDao.listXeplop());
		model.addObject("ListHoc", HocsinhDao.listHocsinh());
		return model;
	}
	
	
	
	@RequestMapping(value="/admin/Lop/Add", method=RequestMethod.POST)
	public String addLop(@ModelAttribute Lop prod){
		if(prod.getLopid() == 0){
			this.LopDao.addLop(prod);
		}
		return "redirect:/admin/Lop";
	}
	
	@RequestMapping(value="/admin/Lop/Remove/{id}")
	public String removeLops(@PathVariable("id") int id){
		this.LopDao.removeLop(id);
		return "redirect:/admin/Lop";
	}
	
	@RequestMapping(value="/admin/Lop/Edit/{id}", method=RequestMethod.GET)
	public ModelAndView editLop(@PathVariable("id") int id){
		Lop listLopById = LopDao.findLop(id);
		ModelAndView model = new ModelAndView("admin/Lop/editLop");
		model.addObject("FLop",listLopById);
		model.addObject("ListXep", XeplopDao.listXeplop());
		model.addObject("ListHoc", HocsinhDao.listHocsinh());
		return model;
	}
	
	@RequestMapping(value="/admin/Lop/Update", method=RequestMethod.POST)
	public String updateLop(@ModelAttribute Lop pro){
		if(pro.getLopid() != 0){
			this.LopDao.updateLop(pro);
		}
		return "redirect:/admin/Lop";
	}
	
	@RequestMapping(value="/admin/Lop/Search")
	public ModelAndView searchLop(String searchString){
		List<Lop> listLops = LopDao.searchForLop(searchString);
		ModelAndView model = new ModelAndView("admin/Lop/listLop");
		model.addObject("LLop",listLops);
		return model;
	}
}

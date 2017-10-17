package TDSchool.com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HOCSINH")
public class Hocsinh {
	private int hocsinhid;
	private String tenhs;
	private String diachi;
	private String ngaysinh;
	private String gioitinh;
	private String sothich;
	private String hinhanh;
	private String phuhuynh;
	private String dienthoaiph;
	
	
	public Set<Thuchi> thuchis;
	@OneToMany(mappedBy = "hocsinh", cascade = CascadeType.ALL)
	public Set<Thuchi> getThuchis() {
		return thuchis;
	}
	public void setThuchis(Set<Thuchi> thuchis) {
		this.thuchis = thuchis;
	}
	
		
	private Set<LoginAccount> accounts;
	@OneToMany(mappedBy = "hs", cascade = CascadeType.ALL)
	public Set<LoginAccount> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<LoginAccount> accounts) {
		this.accounts = accounts;
	}

	public Set<Suckhoebenam> suckhoes;
	
	@OneToMany(mappedBy = "hocsinh", cascade = CascadeType.ALL)
	public Set<Suckhoebenam> getSuckhoes() {
		return suckhoes;
	}
	public void setSuckhoes(Set<Suckhoebenam> suckhoes) {
		this.suckhoes = suckhoes;
	}
	
	public Set<Lop> lops;
	@OneToMany(mappedBy = "hocsinh", cascade = CascadeType.ALL)
	public Set<Lop> getLops() {
		return lops;
	}
	public void setLops(Set<Lop> lops) {
		this.lops = lops;
	}
	
	public Set<RegisterAccount> registerAccounts;
	@OneToMany(mappedBy = "hocsinh", cascade = CascadeType.ALL)
	public Set<RegisterAccount> getRegisterAccounts() {
		return registerAccounts;
	}
	public void setRegisterAccounts(Set<RegisterAccount> registerAccounts) {
		this.registerAccounts = registerAccounts;
	}
	
	
	public Hocsinh(){
		
	}


	
	
	@Id
	@Column(name = "HOCSINHID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getHocsinhid() {
		return hocsinhid;
	}


	@Column(name = "TENHS")
	public void setHocsinhid(int hocsinhid) {
		this.hocsinhid = hocsinhid;
	}



	public String getTenhs() {
		return tenhs;
	}



	public void setTenhs(String tenhs) {
		this.tenhs = tenhs;
	}


	@Column(name = "DIACHI")
	public String getDiachi() {
		return diachi;
	}



	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}


	@Column(name = "NGAYSINH")
	public String getNgaysinh() {
		return ngaysinh;
	}



	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}


	@Column(name = "GIOITINH")
	public String getGioitinh() {
		return gioitinh;
	}



	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}


	@Column(name = "SOTHICH")
	public String getSothich() {
		return sothich;
	}



	public void setSothich(String sothich) {
		this.sothich = sothich;
	}


	@Column(name = "HINHANH")
	public String getHinhanh() {
		return hinhanh;
	}



	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}


	@Column(name = "PHUHUYNH")
	public String getPhuhuynh() {
		return phuhuynh;
	}



	public void setPhuhuynh(String phuhuynh) {
		this.phuhuynh = phuhuynh;
	}


	@Column(name = "DIENTHOAIPH")
	public String getDienthoaiph() {
		return dienthoaiph;
	}



	public void setDienthoaiph(String dienthoaiph) {
		this.dienthoaiph = dienthoaiph;
	}
	
	
	
	
}

package TDSchool.com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BAOMAU")
public class Baomau {
	private int baomauid;
	private String tenbaomau;
	private String diachi;
	private String ngaysinh;
	private String gioitinh;
	private String hinhanh;
	private String dienthoai;

	public Set<Xeplop> xeplops;
	
	@OneToMany(mappedBy = "baomau", cascade = CascadeType.ALL)
	public Set<Xeplop> getXeplops() {
		return xeplops;
	}
	public void setXeplops(Set<Xeplop> xeplops) {
		this.xeplops = xeplops;
	}

	public Baomau(){
		
	}

	@Id
	@Column(name = "BAOMAUID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getBaomauid() {
		return baomauid;
	}



	public void setBaomauid(int baomauid) {
		this.baomauid = baomauid;
	}


	@Column(name = "TENBAOMAU")
	public String getTenbaomau() {
		return tenbaomau;
	}



	public void setTenbaomau(String tenbaomau) {
		this.tenbaomau = tenbaomau;
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

	@Column(name = "HINHANH")
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	

	@Column(name = "DIENTHOAI")
	public String getDienthoai() {
		return dienthoai;
	}



	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}


	
	
}

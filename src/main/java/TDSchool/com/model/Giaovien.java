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
@Table(name = "GIAOVIEN")
public class Giaovien {
	private int Giaovienid;
	private String tengv;
	private String diachi;
	private String ngaysinh;
	private String hinhanh;
	private String gioitinh;
	private String dienthoai;
	private String email;
	private String trinhdo;
	private String chucvu;
	private String kinhnghiem;

	public Set<Xeplop> xeplops;
	@OneToMany(mappedBy = "giaovien", cascade = CascadeType.ALL)
	public Set<Xeplop> getXeplops() {
		return xeplops;
	}
	public void setXeplops(Set<Xeplop> xeplops) {
		this.xeplops = xeplops;
	}
	
	
	public Giaovien(){
		
	}


	@Id
	@Column(name = "GIAOVIENID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getGiaovienid() {
		return Giaovienid;
	}
	public void setGiaovienid(int giaovienid) {
		Giaovienid = giaovienid;
	}

	@Column(name = "TENGV")
	public String getTengv() {
		return tengv;
	}


	public void setTengv(String tengv) {
		this.tengv = tengv;
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
	
	
	@Column(name = "HINHANH")	
	public String getHinhanh() {
		return hinhanh;
	}
	
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	
	@Column(name = "GIOITINH")
	public String getGioitinh() {
		return gioitinh;
	}


	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	@Column(name = "DIENTHOAI")
	public String getDienthoai() {
		return dienthoai;
	}


	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "TRINHDO")
	public String getTrinhdo() {
		return trinhdo;
	}


	public void setTrinhdo(String trinhdo) {
		this.trinhdo = trinhdo;
	}

	@Column(name = "CHUCVU")
	public String getChucvu() {
		return chucvu;
	}


	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}

	@Column(name = "KINHNGHIEM")
	public String getKinhnghiem() {
		return kinhnghiem;
	}


	public void setKinhnghiem(String kinhnghiem) {
		this.kinhnghiem = kinhnghiem;
	}


	


	
}

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
@Table(name = "XEPLOP")
public class Xeplop {
	private int xeplopid;
	private String nhomtuoi;
	private String tenxeplop;
	private String siso;

	private Giaovien giaovien;
	@ManyToOne
    @JoinColumn(name = "GIAOVIENID")
	public Giaovien getGiaovien() {
		return giaovien;
	}

	public void setGiaovien(Giaovien giaovien) {
		this.giaovien = giaovien;
	}
	
	private Baomau baomau;
	@ManyToOne
    @JoinColumn(name = "BAOMAUID")
	public Baomau getBaomau() {
		return baomau;
	}

	public void setBaomau(Baomau baomau) {
		this.baomau = baomau;
	}
	
	public Set<Lop> lops;
	@OneToMany(mappedBy = "xeplop", cascade = CascadeType.ALL)
	public Set<Lop> getLops() {
		return lops;
	}
	public void setLops(Set<Lop> lops) {
		this.lops = lops;
	}
	

	public Xeplop(){
		
	}

	

	@Id
	@Column(name = "XEPLOPID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getXeplopid() {
		return xeplopid;
	}


	public void setXeplopid(int xeplopid) {
		this.xeplopid = xeplopid;
	}

	@Column(name = "NHOMTUOI")
	public String getNhomtuoi() {
		return nhomtuoi;
	}


	public void setNhomtuoi(String nhomtuoi) {
		this.nhomtuoi = nhomtuoi;
	}

	@Column(name = "TENXEPLOP")
	public String getTenxeplop() {
		return tenxeplop;
	}


	public void setTenxeplop(String tenxeplop) {
		this.tenxeplop = tenxeplop;
	}

	@Column(name = "SISO")
	public String getSiso() {
		return siso;
	}


	public void setSiso(String siso) {
		this.siso = siso;
	}


	
	
	
}

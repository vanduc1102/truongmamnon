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
@Table(name = "THUCHI")
public class Thuchi {
	private int thuchiid;
	private Float tienhocphi;
	private Float tienan;
	private Float tienphuthu;
	private Float diemdanh;
	private Float tienthua;
	private Float tongtien;

	
	@Id
	@Column(name = "THUCHIID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getThuchiid() {
		return thuchiid;
	}
	public void setThuchiid(int thuchiid) {
		this.thuchiid = thuchiid;
	}
    @JoinColumn(name = "TIENHOCPHI")
	public Float getTienhocphi() {
		return tienhocphi;
	}
	public void setTienhocphi(Float tienhocphi) {
		this.tienhocphi = tienhocphi;
	}
    @JoinColumn(name = "TIENAN")
	public Float getTienan() {
		return tienan;
	}
	public void setTienan(Float tienan) {
		this.tienan = tienan;
	}
    @JoinColumn(name = "TIENPHUTHU")
	public Float getTienphuthu() {
		return tienphuthu;
	}
	public void setTienphuthu(Float tienphuthu) {
		this.tienphuthu = tienphuthu;
	}
    @JoinColumn(name = "DIEMDANH")
	public Float getDiemdanh() {
		return diemdanh;
	}
	public void setDiemdanh(Float diemdanh) {
		this.diemdanh = diemdanh;
	}
    @JoinColumn(name = "TIENTHUA")
	public Float getTienthua() {
		return tienthua;
	}
	public void setTienthua(Float tienthua) {
		this.tienthua = tienthua;
	}
    @JoinColumn(name = "TONGTIEN")
	public Float getTongtien() {
		return tongtien;
	}
	public void setTongtien(Float tongtien) {
		this.tongtien = tongtien;
	}

	private Hocsinh hocsinh;
	@ManyToOne
    @JoinColumn(name = "HOCSINHID")
	public Hocsinh getHocsinh() {
		return hocsinh;
	}
	public void setHocsinh(Hocsinh hocsinh) {
		this.hocsinh = hocsinh;
	}
	
	
	public Thuchi(){
		
	}

}

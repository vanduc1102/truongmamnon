package TDSchool.com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUCKHOEBENAM")
public class Suckhoebenam {
	private int suckhoebenamid;
	private String ngaykham;
	private Float chieucao;
	private Float sosanhcc;
	private String tinhtrangcc;
	private Float cannang;
	private Float sosanhcn;
	private String tinhtrangcn;
	
	private Hocsinh hocsinh;
	@ManyToOne
    @JoinColumn(name = "HOCSINHID")
	public Hocsinh getHocsinh() {
		return hocsinh;
	}
	public void setHocsinh(Hocsinh hocsinh) {
		this.hocsinh = hocsinh;
	}
	
	private Chuansuckhoe chuansuckhoe;
	@ManyToOne
    @JoinColumn(name = "CHUANSUCKHOEID")
	public Chuansuckhoe getChuansuckhoe() {
		return chuansuckhoe;
	}
	public void setChuansuckhoe(Chuansuckhoe chuansuckhoe) {
		this.chuansuckhoe = chuansuckhoe;
	}
	

	public Suckhoebenam(){
		
	}
	
	
	
	@Id
	@Column(name = "SUCKHOEBENAMID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSuckhoebenamid() {
		return suckhoebenamid;
	}
	public void setSuckhoebenamid(int suckhoebenamid) {
		this.suckhoebenamid = suckhoebenamid;
	}
	@Column(name = "NGAYKHAM")
	public String getNgaykham() {
		return ngaykham;
	}
	public void setNgaykham(String ngaykham) {
		this.ngaykham = ngaykham;
	}
	@Column(name = "CHIEUCAO")
	public Float getChieucao() {
		return chieucao;
	}
	public void setChieucao(Float chieucao) {
		this.chieucao = chieucao;
	}
	@Column(name = "CANNANG")
	public Float getCannang() {
		return cannang;
	}
	public void setCannang(Float cannang) {
		this.cannang = cannang;
	}
	@Column(name = "SOSANHCC")
	public Float getSosanhcc() {
		return sosanhcc;
	}
	public void setSosanhcc(Float sosanhcc) {
		this.sosanhcc = sosanhcc;
	}
	@Column(name = "TINHTRANGCC")
	public String getTinhtrangcc() {
		return tinhtrangcc;
	}
	public void setTinhtrangcc(String tinhtrangcc) {
		this.tinhtrangcc = tinhtrangcc;
	}
	@Column(name = "SOSANHCN")
	public Float getSosanhcn() {
		return sosanhcn;
	}
	public void setSosanhcn(Float sosanhcn) {
		this.sosanhcn = sosanhcn;
	}
	@Column(name = "TINHTRANGCN")
	public String getTinhtrangcn() {
		return tinhtrangcn;
	}
	public void setTinhtrangcn(String tinhtrangcn) {
		this.tinhtrangcn = tinhtrangcn;
	}
	
	

}

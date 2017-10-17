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
@Table(name = "Chuansuckhoe")
public class Chuansuckhoe {
	private int chuansuckhoeid;
	private String thangtuoi;
	private Float chuanchieucaonam;
	private Float chuancannangnam;
	
	private Float chuanchieucaonu;
	private Float chuancannangnu;
	
	public Set<Suckhoebenam> suckhoes;
	
	@OneToMany(mappedBy = "chuansuckhoe", cascade = CascadeType.ALL)
	public Set<Suckhoebenam> getSuckhoes() {
		return suckhoes;
	}

	public void setSuckhoes(Set<Suckhoebenam> suckhoes) {
		this.suckhoes = suckhoes;
	}
	
	public Chuansuckhoe(){
		
	}
	
	

	@Id
	@Column(name = "CHUANSUCKHOEID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getChuansuckhoeid() {
		return chuansuckhoeid;
	}
	public void setChuansuckhoeid(int chuansuckhoeid) {
		this.chuansuckhoeid = chuansuckhoeid;
	}
	@Column(name = "THANGTUOI")
	public String getThangtuoi() {
		return thangtuoi;
	}
	public void setThangtuoi(String thangtuoi) {
		this.thangtuoi = thangtuoi;
	}
	@Column(name = "CHUANCHIEUCAONAM")
	public Float getChuanchieucaonam() {
		return chuanchieucaonam;
	}
	public void setChuanchieucaonam(Float chuanchieucaonam) {
		this.chuanchieucaonam = chuanchieucaonam;
	}
	@Column(name = "CHUANCANNANGNAM")
	public Float getChuancannangnam() {
		return chuancannangnam;
	}
	public void setChuancannangnam(Float chuancannangnam) {
		this.chuancannangnam = chuancannangnam;
	}
	
	@Column(name = "CHUANCHIEUCAONU")
	public Float getChuanchieucaonu() {
		return chuanchieucaonu;
	}
	public void setChuanchieucaonu(Float chuanchieucaonu) {
		this.chuanchieucaonu = chuanchieucaonu;
	}
	@Column(name = "CHUANCANNANGNU")
	public Float getChuancannangnu() {
		return chuancannangnu;
	}
	public void setChuancannangnu(Float chuancannangnu) {
		this.chuancannangnu = chuancannangnu;
	}

	
}

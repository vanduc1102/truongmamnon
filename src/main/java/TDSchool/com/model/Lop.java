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
@Table(name = "LOP")
public class Lop {
	private int lopid;
	
	private Xeplop xeplop;
	@ManyToOne
    @JoinColumn(name = "XEPLOPID")
	public Xeplop getXeplop() {
		return xeplop;
	}
	public void setXeplop(Xeplop xeplop) {
		this.xeplop = xeplop;
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

	public Lop(){
		
	}

	@Id
	@Column(name = "LOPID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getLopid() {
		return lopid;
	}
	public void setLopid(int lopid) {
		this.lopid = lopid;
	}
	
	
	
	
	
}

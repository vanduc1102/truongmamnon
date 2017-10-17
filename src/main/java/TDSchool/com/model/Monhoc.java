package TDSchool.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MONHOC")
public class Monhoc {
	private int monhocid;
	private String tenmonhoc;
	private String sotiet;
	private String thoigian;

	public Monhoc(){
		
	}
	
	@Id
	@Column(name = "MONHOCID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getMonhocid() {
		return monhocid;
	}

	public void setMonhocid(int monhocid) {
		this.monhocid = monhocid;
	}
	@Column(name = "TENMONHOC")
	public String getTenmonhoc() {
		return tenmonhoc;
	}

	public void setTenmonhoc(String tenmonhoc) {
		this.tenmonhoc = tenmonhoc;
	}
	@Column(name = "SOTIET")
	public String getSotiet() {
		return sotiet;
	}

	public void setSotiet(String sotiet) {
		this.sotiet = sotiet;
	}
	@Column(name = "THOIGIAN")
	public String getThoigian() {
		return thoigian;
	}

	public void setThoigian(String thoigian) {
		this.thoigian = thoigian;
	}


	
}

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
@Table(name = "THUCDONTRONGTUAN")
public class Thucdontrongtuan {
	private int thucdontrongtuanid;
	private String buoi;
	private String thu2;
	private String thu3;
	private String thu4;
	private String thu5;
	private String thu6;
	private String thu7;
	private String chunhat;
	
	@Id
	@Column(name = "THUCDONTRONGTUANID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getThucdontrongtuanid() {
		return thucdontrongtuanid;
	}

	public void setThucdontrongtuanid(int thucdontrongtuanid) {
		this.thucdontrongtuanid = thucdontrongtuanid;
	}
	@Column(name = "BUOI")
	public String getBuoi() {
		return buoi;
	}
	public void setBuoi(String buoi) {
		this.buoi = buoi;
	}
	@Column(name = "THU2")
	public String getThu2() {
		return thu2;
	}

	public void setThu2(String thu2) {
		this.thu2 = thu2;
	}
	@Column(name = "THU3")
	public String getThu3() {
		return thu3;
	}

	public void setThu3(String thu3) {
		this.thu3 = thu3;
	}
	@Column(name = "THU4")
	public String getThu4() {
		return thu4;
	}

	public void setThu4(String thu4) {
		this.thu4 = thu4;
	}
	@Column(name = "THU5")
	public String getThu5() {
		return thu5;
	}

	public void setThu5(String thu5) {
		this.thu5 = thu5;
	}
	@Column(name = "THU6")
	public String getThu6() {
		return thu6;
	}

	public void setThu6(String thu6) {
		this.thu6 = thu6;
	}
	@Column(name = "THU7")
	public String getThu7() {
		return thu7;
	}

	public void setThu7(String thu7) {
		this.thu7 = thu7;
	}
	@Column(name = "CHUNHAT")
	public String getChunhat() {
		return chunhat;
	}

	public void setChunhat(String chunhat) {
		this.chunhat = chunhat;
	}
	
	public Thucdontrongtuan(){
		
	}
}

package TDSchool.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LICHHDKHOITRE")
public class Lichhdkhoitre {
	private int lichhdkhoitreid;
	private String thoigian;
	private String hoatdong;
	
	public Lichhdkhoitre(){
		
	}

	@Id
	@Column(name = "LICHHDKHOITREID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getLichhdkhoitreid() {
		return lichhdkhoitreid;
	}
	public void setLichhdkhoitreid(int lichhdkhoitreid) {
		this.lichhdkhoitreid = lichhdkhoitreid;
	}
	@Column(name = "THOIGIAN")
	public String getThoigian() {
		return thoigian;
	}
	public void setThoigian(String thoigian) {
		this.thoigian = thoigian;
	}
	@Column(name = "HOATDONG")
	public String getHoatdong() {
		return hoatdong;
	}
	public void setHoatdong(String hoatdong) {
		this.hoatdong = hoatdong;
	}
	
}

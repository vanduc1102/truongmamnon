package TDSchool.com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LICHHDMAUGIAO")
public class Lichhdmaugiao {
	private int lichhdmaugiaoid;
	private String thoigian;
	private String hoatdong;
	
	public Lichhdmaugiao(){
		
	}
	
	@Id
	@Column(name = "LICHHDMAUGIAOID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getLichhdmaugiaoid() {
		return lichhdmaugiaoid;
	}

	public void setLichhdmaugiaoid(int lichhdmaugiaoid) {
		this.lichhdmaugiaoid = lichhdmaugiaoid;
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

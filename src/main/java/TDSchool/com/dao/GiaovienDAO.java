package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Giaovien;

public interface GiaovienDAO {
	public List<Giaovien> listGiaovien();
	public void addGiaovien(Giaovien st);
	public void removeGiaovien(int id);
	public Giaovien findGiaovien(int id);
	public void updateGiaovien(Giaovien st);
	public List<Giaovien> searchForGiaovien(String searchString);
	
}

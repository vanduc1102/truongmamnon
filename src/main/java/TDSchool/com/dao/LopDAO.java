package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Lop;

public interface LopDAO {
	public List<Lop> listLop();
	public void addLop(Lop st);
	public void removeLop(int id);
	public Lop findLop(int id);
	public void updateLop(Lop st);
	public List<Lop> searchForLop(String searchString);
	public List<Lop> listLopTheoId(int xepLopId);
	List<Lop> detailHocsinhById(int hocsinhId);
}

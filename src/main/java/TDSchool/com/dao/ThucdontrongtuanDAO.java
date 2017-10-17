package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Thucdontrongtuan;

public interface ThucdontrongtuanDAO {
	public List<Thucdontrongtuan> listThucdontrongtuan();
	public void addThucdontrongtuan(Thucdontrongtuan st);
	public void removeThucdontrongtuan(int id);
	public Thucdontrongtuan findThucdontrongtuan(int id);
	public void updateThucdontrongtuan(Thucdontrongtuan st);
	public List<Thucdontrongtuan> searchForThucdontrongtuan(String searchString);
	
}

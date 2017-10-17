package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Monhoc;

public interface MonhocDAO {
	public List<Monhoc> listMonhoc();
	public void addMonhoc(Monhoc st);
	public void removeMonhoc(int id);
	public Monhoc findMonhoc(int id);
	public void updateMonhoc(Monhoc st);
	public List<Monhoc> searchForMonhoc(String searchString);
	
}

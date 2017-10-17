package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Thuchi;

public interface ThuchiDAO {
	public List<Thuchi> listThuchi();
	public void addThuchi(Thuchi st);
	public void removeThuchi(int id);
	public Thuchi findThuchi(int id);
	public void updateThuchi(Thuchi st);
	public List<Thuchi> searchForThuchi(String searchString);
	
}

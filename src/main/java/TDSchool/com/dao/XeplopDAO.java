package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Xeplop;

public interface XeplopDAO {
	public List<Xeplop> listXeplop();
	public void addXeplop(Xeplop st);
	public void removeXeplop(int id);
	public Xeplop findXeplop(int id);
	public void updateXeplop(Xeplop st);
	public List<Xeplop> searchForXeplop(String searchString);
	
}

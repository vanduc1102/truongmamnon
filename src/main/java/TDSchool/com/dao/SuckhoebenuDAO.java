package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Suckhoebenu;

public interface SuckhoebenuDAO {
	public List<Suckhoebenu> listSuckhoebenu();
	public void addSuckhoebenu(Suckhoebenu st);
	public void removeSuckhoebenu(int id);
	public Suckhoebenu findSuckhoebenu(int id);
	public void updateSuckhoebenu(Suckhoebenu st);
	public List<Suckhoebenu> searchForSuckhoebenu(String searchString);
	
}

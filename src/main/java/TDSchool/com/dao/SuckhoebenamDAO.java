package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Suckhoebenam;

public interface SuckhoebenamDAO {
	public List<Suckhoebenam> listSuckhoebenam();
	public void addSuckhoebenam(Suckhoebenam st);
	public void removeSuckhoebenam(int id);
	public Suckhoebenam findSuckhoebenam(int id);
	public void updateSuckhoebenam(Suckhoebenam st);
	public List<Suckhoebenam> searchForSuckhoebenam(String searchString);
	
}

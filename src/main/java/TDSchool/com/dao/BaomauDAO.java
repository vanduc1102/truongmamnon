package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Baomau;

public interface BaomauDAO {
	public List<Baomau> listBaomau();
	public void addBaomau(Baomau st);
	public void removeBaomau(int id);
	public Baomau findBaomau(int id);
	public void updateBaomau(Baomau st);
	public List<Baomau> searchForBaomau(String searchString);
	
}

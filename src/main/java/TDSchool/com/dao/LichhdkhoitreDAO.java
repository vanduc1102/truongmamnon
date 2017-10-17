package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Lichhdkhoitre;

public interface LichhdkhoitreDAO {
	public List<Lichhdkhoitre> listLichhdkhoitre();
	public void addLichhdkhoitre(Lichhdkhoitre st);
	public void removeLichhdkhoitre(int id);
	public Lichhdkhoitre findLichhdkhoitre(int id);
	public void updateLichhdkhoitre(Lichhdkhoitre st);
	public List<Lichhdkhoitre> searchForLichhdkhoitre(String searchString);
	
}

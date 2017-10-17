package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Lichhdmaugiao;

public interface LichhdmaugiaoDAO {
	public List<Lichhdmaugiao> listLichhdmaugiao();
	public void addLichhdmaugiao(Lichhdmaugiao st);
	public void removeLichhdmaugiao(int id);
	public Lichhdmaugiao findLichhdmaugiao(int id);
	public void updateLichhdmaugiao(Lichhdmaugiao st);
	public List<Lichhdmaugiao> searchForLichhdmaugiao(String searchString);
	
}

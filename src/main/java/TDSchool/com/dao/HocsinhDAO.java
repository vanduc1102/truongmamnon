package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Hocsinh;

public interface HocsinhDAO {
	public List<Hocsinh> listHocsinh();
	public void addHocsinh(Hocsinh st);
	public void removeHocsinh(int id);
	public Hocsinh findHocsinh(int id);
	public void updateHocsinh(Hocsinh st);
	public List<Hocsinh> searchForHocsinh(String searchString);
	
	
}

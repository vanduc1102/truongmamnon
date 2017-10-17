package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Chuansuckhoe;

public interface ChuansuckhoeDAO {
	public List<Chuansuckhoe> listChuansuckhoe();
	public void addChuansuckhoe(Chuansuckhoe st);
	public void removeChuansuckhoe(int id);
	public Chuansuckhoe findChuansuckhoe(int id);
	public void updateChuansuckhoe(Chuansuckhoe st);
	public List<Chuansuckhoe> searchForChuansuckhoe(String searchString);
	
}

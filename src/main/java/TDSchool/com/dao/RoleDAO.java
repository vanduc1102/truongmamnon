package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.Role;

public interface RoleDAO {
	public List<Role> listRole();
	public void addRole(Role st);
	public void removeRole(int id);
	public Role findRole(int id);
	public void updateRole(Role st);
	public List<Role> searchForRole(String searchString);
	
}

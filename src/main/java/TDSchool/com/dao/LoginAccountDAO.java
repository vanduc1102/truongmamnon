package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.LoginAccount;

public interface LoginAccountDAO {
	List<LoginAccount> listAll();
	LoginAccount findAccountByName(String name);
	void addAccount(LoginAccount accountlog);
}

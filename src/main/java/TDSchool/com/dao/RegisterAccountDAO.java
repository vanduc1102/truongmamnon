package TDSchool.com.dao;

import java.util.List;

import TDSchool.com.model.RegisterAccount;


public interface RegisterAccountDAO {
	List<RegisterAccount> listAll();
	void addAccount(RegisterAccount acc);
	RegisterAccount findByUsername(String username);
	void createVerifyAccount(RegisterAccount acc, String token);
	public RegisterAccount findAccountById(int accountId);
	public void updateAccount(RegisterAccount ra);
	public void removeAccount(int accountId);
}

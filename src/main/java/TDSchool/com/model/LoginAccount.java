package TDSchool.com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "ACCOUNTS")
public class LoginAccount {
	private int accountId;
	private String userName;
	private String passWord;
	private String confirmPassword;
	private String emailAddress;
	private String fullName;
	private boolean isEnabled;
	private Role roles;
	
	private Hocsinh hs;
	
	@ManyToOne
    @JoinColumn(name = "HOCSINHID")
	public Hocsinh getHs() {
		return hs;
	}

	public void setHs(Hocsinh hs) {
		this.hs = hs;
	}

	@Column(name = "FULLNAME")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LoginAccount(){
	}
	
	@Column(name = "CONFIRM_PASSWORD")
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Id
    @Column(name = "ACCOUNT_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	@Column(name = "USER_NAME")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "PASSWORD")
	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Column(name = "EMAIL_ADDRESS")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Column(name = "ENABLED")
	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	@ManyToOne
    @JoinColumn(name = "ROLE_ID")
	public Role getRoles() {
		return roles;
	}

	public void setRoles(Role roles) {
		this.roles = roles;
	}
	

	
}

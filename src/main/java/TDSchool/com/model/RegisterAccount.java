package TDSchool.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "ACCOUNTS")
public class RegisterAccount {
	private int accountId;
	private String username;
	private String password;
	private String passwordConfirm;
	private String emailAddress;
	private boolean isEnabled;
	private Role r;
	private String fullName;
	
	@Column(name = "FULLNAME")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@ManyToOne
    @JoinColumn(name = "ROLE_ID")
	public Role getR() {
		return r;
	}

	public void setR(Role r) {
		this.r = r;
	}

	public RegisterAccount() {
		super();
		this.isEnabled = true;
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
	
	@NotEmpty
	@Column(name = "USER_NAME")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@NotEmpty
	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@NotEmpty
	@Column(name = "CONFIRM_PASSWORD")
	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
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



	private Hocsinh hocsinh;
	@ManyToOne
    @JoinColumn(name = "HOCSINHID")
	public Hocsinh getHocsinh() {
		return hocsinh;
	}
	public void setHocsinh(Hocsinh hocsinh) {
		this.hocsinh = hocsinh;
	}
	
}
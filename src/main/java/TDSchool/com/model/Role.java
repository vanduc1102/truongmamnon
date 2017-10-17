package TDSchool.com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Role {
	private int roleId;
	private String roleName;
	private Set<RegisterAccount> listAcc;
	
	
	@OneToMany(mappedBy = "r", cascade = CascadeType.ALL)
	public Set<RegisterAccount> getListAcc() {
		return listAcc;
	}

	public void setListAcc(Set<RegisterAccount> listAcc) {
		this.listAcc = listAcc;
	}

	
	public Role(){
		
	}
	
	@Id
    @Column(name = "ROLE_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "AUTHORITY")
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	private Set<LoginAccount> accounts;
	@OneToMany(mappedBy = "roles", cascade = CascadeType.ALL)
	public Set<LoginAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<LoginAccount> accounts) {
		this.accounts = accounts;
	}
	
	
}

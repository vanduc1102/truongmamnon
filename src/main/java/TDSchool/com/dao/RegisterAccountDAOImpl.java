package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.RegisterAccount;


@Transactional
public class RegisterAccountDAOImpl implements RegisterAccountDAO {
	
	private SessionFactory sessionFactory;
	
	public RegisterAccountDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<RegisterAccount> listAll() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from RegisterAccount");
		@SuppressWarnings("unchecked")
		List<RegisterAccount> listAccounts = query.list();
		return listAccounts;
	}

	@Override
	public void addAccount(RegisterAccount acc) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(acc);
	}

	@Override
	public RegisterAccount findByUsername(String username) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from RegisterAccount where user_name = :username");
		query.setParameter("username", username);
		query.getFirstResult();
		RegisterAccount acc = (RegisterAccount) query.uniqueResult();
		return acc;
	}

	@Override
	public void createVerifyAccount(RegisterAccount acc, String token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RegisterAccount findAccountById(int accountId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from RegisterAccount where accountId = :accountId");
		query.setParameter("accountId", accountId);
		return (RegisterAccount) query.uniqueResult();
	}

	@Override
	public void updateAccount(RegisterAccount ra) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("update RegisterAccount set user_name = :username, password = :pass, fullname = :name, email_address = :email, role_id = :role, HocsinhId = :hocsinhId where account_id = :accountId");
		query.setParameter("username", ra.getUsername());
		query.setParameter("pass", ra.getPassword());
		query.setParameter("name", ra.getFullName());
		query.setParameter("email", ra.getEmailAddress());
		query.setParameter("role", ra.getR().getRoleId());
		query.setParameter("hocsinhId", ra.getHocsinh().getHocsinhid());
		query.setParameter("accountId", ra.getAccountId());
		query.executeUpdate();
	}

	@Override
	public void removeAccount(int accountId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from RegisterAccount where accountId = :accountId");
		query.setParameter("accountId", accountId);
		query.executeUpdate();
	}

	

}

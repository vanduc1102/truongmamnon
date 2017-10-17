package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import TDSchool.com.model.LoginAccount;

@Transactional
public class LoginAccountDAOImpl implements LoginAccountDAO {
	
	private SessionFactory sessionFactory;
	
	public LoginAccountDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<LoginAccount> listAll() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from LoginAccount");
		@SuppressWarnings("unchecked")
		List<LoginAccount> lisAcc = query.list();
		return lisAcc;
	}


	@Override
	public LoginAccount findAccountByName(String name) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from LoginAccount where user_name = :username");
		query.setParameter("username", name);
		LoginAccount acc = (LoginAccount) query.uniqueResult();
		return acc;
	}

	@Override
	public void addAccount(LoginAccount loginaccount) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(loginaccount);
	}

}

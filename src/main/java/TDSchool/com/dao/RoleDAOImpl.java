package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Role;

@Transactional
public class RoleDAOImpl implements RoleDAO {
	
	private SessionFactory sessionFactory;
	
	public RoleDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Role> listRole() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Role> listRoles = session.createQuery("from Role").list();
		return listRoles;
	}

	@Override
	public void addRole(Role st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeRole(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Role s = (Role) session.get(Role.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Role findRole(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Role s = (Role) session.get(Role.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateRole(Role st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Role> searchForRole(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Role h where "
				+ "h.roleName like :roleName");
		query.setParameter("roleName", "%"+searchString+"%");
		List<Role> listRole = query.list();
		return listRole;
	}
	
}

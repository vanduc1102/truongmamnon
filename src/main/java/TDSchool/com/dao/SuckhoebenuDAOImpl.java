package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Suckhoebenu;

@Transactional
public class SuckhoebenuDAOImpl implements SuckhoebenuDAO {
	
	private SessionFactory sessionFactory;
	
	public SuckhoebenuDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Suckhoebenu> listSuckhoebenu() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Suckhoebenu> listSuckhoebenus = session.createQuery("from Suckhoebenu").list();
		return listSuckhoebenus;
	}

	@Override
	public void addSuckhoebenu(Suckhoebenu st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeSuckhoebenu(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Suckhoebenu s = (Suckhoebenu) session.get(Suckhoebenu.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Suckhoebenu findSuckhoebenu(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Suckhoebenu s = (Suckhoebenu) session.get(Suckhoebenu.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateSuckhoebenu(Suckhoebenu st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Suckhoebenu> searchForSuckhoebenu(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Suckhoebenu h where "
				+ "h.tensuckhoe like :tensuckhoe");
		query.setParameter("tensuckhoe", "%"+searchString+"%");
		List<Suckhoebenu> listSuc = query.list();
		return listSuc;
	}
	
}

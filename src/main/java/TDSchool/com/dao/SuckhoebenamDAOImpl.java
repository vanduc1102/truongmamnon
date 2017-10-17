package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Suckhoebenam;

@Transactional
public class SuckhoebenamDAOImpl implements SuckhoebenamDAO {
	
	private SessionFactory sessionFactory;
	
	public SuckhoebenamDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Suckhoebenam> listSuckhoebenam() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Suckhoebenam> listSuckhoebenams = session.createQuery("from Suckhoebenam").list();
		return listSuckhoebenams;
	}

	@Override
	public void addSuckhoebenam(Suckhoebenam st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeSuckhoebenam(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Suckhoebenam s = (Suckhoebenam) session.get(Suckhoebenam.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Suckhoebenam findSuckhoebenam(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Suckhoebenam s = (Suckhoebenam) session.get(Suckhoebenam.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateSuckhoebenam(Suckhoebenam st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Suckhoebenam> searchForSuckhoebenam(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Suckhoebenam h where "
				+ "h.tensuckhoe like :tensuckhoe");
		query.setParameter("tensuckhoe", "%"+searchString+"%");
		List<Suckhoebenam> listSuc = query.list();
		return listSuc;
	}
	
}

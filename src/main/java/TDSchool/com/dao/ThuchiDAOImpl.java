package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Thuchi;

@Transactional
public class ThuchiDAOImpl implements ThuchiDAO {
	
	private SessionFactory sessionFactory;
	
	public ThuchiDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Thuchi> listThuchi() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Thuchi> listThuchis = session.createQuery("from Thuchi").list();
		return listThuchis;
	}

	@Override
	public void addThuchi(Thuchi st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeThuchi(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Thuchi s = (Thuchi) session.get(Thuchi.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Thuchi findThuchi(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Thuchi s = (Thuchi) session.get(Thuchi.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateThuchi(Thuchi st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Thuchi> searchForThuchi(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Thuchi h where "
				+ "h.tenbaomau like :tenbaomau");
		query.setParameter("tenbaomau", "%"+searchString+"%");
		List<Thuchi> listThuchi = query.list();
		return listThuchi;
	}
	
}

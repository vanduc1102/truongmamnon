package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Xeplop;

@Transactional
public class XeplopDAOImpl implements XeplopDAO {
	
	private SessionFactory sessionFactory;
	
	public XeplopDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Xeplop> listXeplop() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Xeplop> listXeplops = session.createQuery("from Xeplop").list();
		return listXeplops;
	}

	@Override
	public void addXeplop(Xeplop st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeXeplop(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Xeplop s = (Xeplop) session.get(Xeplop.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Xeplop findXeplop(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Xeplop s = (Xeplop) session.get(Xeplop.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateXeplop(Xeplop st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Xeplop> searchForXeplop(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Xeplop h where "
				+ "h.tenxeplop like :tenxeplop");
		query.setParameter("tenxeplop", "%"+searchString+"%");
		List<Xeplop> listXep = query.list();
		return listXep;
	}
	
}

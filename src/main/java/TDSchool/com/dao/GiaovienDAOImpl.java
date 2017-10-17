package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Giaovien;

@Transactional
public class GiaovienDAOImpl implements GiaovienDAO {
	
	private SessionFactory sessionFactory;
	
	public GiaovienDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Giaovien> listGiaovien() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Giaovien> listGiaoviens = session.createQuery("from Giaovien").list();
		return listGiaoviens;
	}

	@Override
	public void addGiaovien(Giaovien st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeGiaovien(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Giaovien s = (Giaovien) session.get(Giaovien.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Giaovien findGiaovien(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Giaovien s = (Giaovien) session.get(Giaovien.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateGiaovien(Giaovien st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Giaovien> searchForGiaovien(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Giaovien h where "
				+ "h.tengv like :tengv");
		query.setParameter("tengv", "%"+searchString+"%");
		List<Giaovien> listGiao = query.list();
		return listGiao;
	}
	
}

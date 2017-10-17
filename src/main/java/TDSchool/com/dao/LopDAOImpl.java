package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Lop;

@Transactional
public class LopDAOImpl implements LopDAO {
	
	private SessionFactory sessionFactory;
	
	public LopDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Lop> listLop() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Lop> listLops = session.createQuery("from Lop").list();
		return listLops;
	}

	@Override
	public void addLop(Lop st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeLop(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Lop s = (Lop) session.get(Lop.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Lop findLop(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Lop s = (Lop) session.get(Lop.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateLop(Lop st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Lop> searchForLop(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Lop h where "
				+ "h.tenhs like :tenhs");
		query.setParameter("tenhs", "%"+searchString+"%");
		List<Lop> listLop = query.list();
		return listLop;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Lop> listLopTheoId(int xepLopId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Lop where XeplopId = :xepId");
		query.setParameter("xepId", xepLopId);
		return query.list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Lop> detailHocsinhById(int hocsinhId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Lop where hocsinhId = :hocsinhId");
		query.setParameter("hocsinhId", hocsinhId);
		return query.list();
	}
	
}

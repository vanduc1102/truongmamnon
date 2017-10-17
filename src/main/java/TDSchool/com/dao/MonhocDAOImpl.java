package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Monhoc;

@Transactional
public class MonhocDAOImpl implements MonhocDAO {
	
	private SessionFactory sessionFactory;
	
	public MonhocDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Monhoc> listMonhoc() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Monhoc> listMonhocs = session.createQuery("from Monhoc").list();
		return listMonhocs;
	}

	@Override
	public void addMonhoc(Monhoc st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeMonhoc(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Monhoc s = (Monhoc) session.get(Monhoc.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Monhoc findMonhoc(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Monhoc s = (Monhoc) session.get(Monhoc.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateMonhoc(Monhoc st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Monhoc> searchForMonhoc(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Monhoc h where "
				+ "h.tenmonhoc like :tenmonhoc");
		query.setParameter("tenmonhoc", "%"+searchString+"%");
		List<Monhoc> listMon = query.list();
		return listMon;
	}
	
}

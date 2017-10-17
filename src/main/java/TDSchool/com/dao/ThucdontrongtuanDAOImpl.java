package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Thucdontrongtuan;

@Transactional
public class ThucdontrongtuanDAOImpl implements ThucdontrongtuanDAO {
	
	private SessionFactory sessionFactory;
	
	public ThucdontrongtuanDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Thucdontrongtuan> listThucdontrongtuan() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Thucdontrongtuan> listThucdontrongtuans = session.createQuery("from Thucdontrongtuan").list();
		return listThucdontrongtuans;
	}

	@Override
	public void addThucdontrongtuan(Thucdontrongtuan st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeThucdontrongtuan(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Thucdontrongtuan s = (Thucdontrongtuan) session.get(Thucdontrongtuan.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Thucdontrongtuan findThucdontrongtuan(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Thucdontrongtuan s = (Thucdontrongtuan) session.get(Thucdontrongtuan.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateThucdontrongtuan(Thucdontrongtuan st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Thucdontrongtuan> searchForThucdontrongtuan(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Thucdontrongtuan h where "
				+ "h.buoi like :buoi");
		query.setParameter("buoi", "%"+searchString+"%");
		List<Thucdontrongtuan> listThucdontrongtuan = query.list();
		return listThucdontrongtuan;
	}
	
}

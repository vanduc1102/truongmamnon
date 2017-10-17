package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Baomau;

@Transactional
public class BaomauDAOImpl implements BaomauDAO {
	
	private SessionFactory sessionFactory;
	
	public BaomauDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Baomau> listBaomau() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Baomau> listBaomaus = session.createQuery("from Baomau").list();
		return listBaomaus;
	}

	@Override
	public void addBaomau(Baomau st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeBaomau(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Baomau s = (Baomau) session.get(Baomau.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Baomau findBaomau(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Baomau s = (Baomau) session.get(Baomau.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateBaomau(Baomau st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Baomau> searchForBaomau(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Baomau h where "
				+ "h.tenbaomau like :tenbaomau");
		query.setParameter("tenbaomau", "%"+searchString+"%");
		List<Baomau> listBao = query.list();
		return listBao;
	}
	
}

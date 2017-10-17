package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Lichhdmaugiao;

@Transactional
public class LichhdmaugiaoDAOImpl implements LichhdmaugiaoDAO {
	
	private SessionFactory sessionFactory;
	
	public LichhdmaugiaoDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Lichhdmaugiao> listLichhdmaugiao() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Lichhdmaugiao> listLichhdmaugiaos = session.createQuery("from Lichhdmaugiao").list();
		return listLichhdmaugiaos;
	}

	@Override
	public void addLichhdmaugiao(Lichhdmaugiao st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeLichhdmaugiao(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Lichhdmaugiao s = (Lichhdmaugiao) session.get(Lichhdmaugiao.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Lichhdmaugiao findLichhdmaugiao(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Lichhdmaugiao s = (Lichhdmaugiao) session.get(Lichhdmaugiao.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateLichhdmaugiao(Lichhdmaugiao st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Lichhdmaugiao> searchForLichhdmaugiao(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Lichhdmaugiao h where "
				+ "h.thoigian like :thoigian");
		query.setParameter("thoigian", "%"+searchString+"%");
		List<Lichhdmaugiao> listMaugiao = query.list();
		return listMaugiao;
	}
	
}

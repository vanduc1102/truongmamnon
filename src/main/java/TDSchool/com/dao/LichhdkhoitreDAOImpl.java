package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Lichhdkhoitre;

@Transactional
public class LichhdkhoitreDAOImpl implements LichhdkhoitreDAO {
	
	private SessionFactory sessionFactory;
	
	public LichhdkhoitreDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Lichhdkhoitre> listLichhdkhoitre() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Lichhdkhoitre> listLichhdkhoitres = session.createQuery("from Lichhdkhoitre").list();
		return listLichhdkhoitres;
	}

	@Override
	public void addLichhdkhoitre(Lichhdkhoitre st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeLichhdkhoitre(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Lichhdkhoitre s = (Lichhdkhoitre) session.get(Lichhdkhoitre.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Lichhdkhoitre findLichhdkhoitre(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Lichhdkhoitre s = (Lichhdkhoitre) session.get(Lichhdkhoitre.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateLichhdkhoitre(Lichhdkhoitre st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Lichhdkhoitre> searchForLichhdkhoitre(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Lichhdkhoitre h where "
				+ "h.thoigian like :thoigian");
		query.setParameter("thoigian", "%"+searchString+"%");
		List<Lichhdkhoitre> listKhoitre = query.list();
		return listKhoitre;
	}
	
}

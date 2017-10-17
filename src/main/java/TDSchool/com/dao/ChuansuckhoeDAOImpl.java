package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Chuansuckhoe;

@Transactional
public class ChuansuckhoeDAOImpl implements ChuansuckhoeDAO {
	
	private SessionFactory sessionFactory;
	
	public ChuansuckhoeDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Chuansuckhoe> listChuansuckhoe() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Chuansuckhoe> listChuansuckhoes = session.createQuery("from Chuansuckhoe").list();
		return listChuansuckhoes;
	}

	@Override
	public void addChuansuckhoe(Chuansuckhoe st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeChuansuckhoe(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Chuansuckhoe s = (Chuansuckhoe) session.get(Chuansuckhoe.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Chuansuckhoe findChuansuckhoe(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Chuansuckhoe s = (Chuansuckhoe) session.get(Chuansuckhoe.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateChuansuckhoe(Chuansuckhoe st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Chuansuckhoe> searchForChuansuckhoe(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Chuansuckhoe h where "
				+ "h.thangtuoi like :thangtuoi");
		query.setParameter("thangtuoi", "%"+searchString+"%");
		List<Chuansuckhoe> listChuan = query.list();
		return listChuan;
	}
	
}

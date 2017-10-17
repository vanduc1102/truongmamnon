package TDSchool.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import TDSchool.com.model.Hocsinh;

@Transactional
public class HocsinhDAOImpl implements HocsinhDAO {
	
	private SessionFactory sessionFactory;
	
	public HocsinhDAOImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Hocsinh> listHocsinh() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Hocsinh> listHocsinhs = session.createQuery("from Hocsinh").list();
		return listHocsinhs;
	}

	@Override
	public void addHocsinh(Hocsinh st) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(st);
	}
	
	@Override
	public void removeHocsinh(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Hocsinh s = (Hocsinh) session.get(Hocsinh.class, new Integer(id));
		if(s != null){
			session.delete(s);
		}
	}
	
	@Override
	public Hocsinh findHocsinh(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Hocsinh s = (Hocsinh) session.get(Hocsinh.class, new Integer(id));
		return s;
	}
	
	@Override
	public void updateHocsinh(Hocsinh st){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(st);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Hocsinh> searchForHocsinh(String searchString){
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select h from Hocsinh h where "
				+ "h.tenhs like :tenhs");
		query.setParameter("tenhs", "%"+searchString+"%");
		List<Hocsinh> listHoc = query.list();
		return listHoc;
	}
	
}

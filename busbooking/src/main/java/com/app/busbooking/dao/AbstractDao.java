package com.app.busbooking.dao;

import java.io.Serializable;



import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
@SuppressWarnings("unchecked")
public abstract class AbstractDao<PK extends Serializable, T> {
	
	private final Class<T> persistentClass;
	

	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	@Autowired
	private SessionFactory sessionFactory;

	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}// end

	
	protected Criteria createEntityCriteria(){
		return getSession().createCriteria(persistentClass);
	}// end

	
	
	
	     public List<T> getAll() {
	    	 return (List<T>) createEntityCriteria().setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		  }

		  public void save(T object) throws Exception {
		    getSession().saveOrUpdate(object);

		  }

		  public T get(Integer id) {
		    return (T) getSession().get(persistentClass, id);
		  }

		  public int count() {
		    return 0;
		  }

		  public void delete(Integer id) {
			  getSession().delete(getSession().get(persistentClass, id));
//			  Query query = getSession().createQuery("delete from User where id = :id");
//				
//				query.setLong("id", id);
//				query.executeUpdate();
		  }
	
	

}

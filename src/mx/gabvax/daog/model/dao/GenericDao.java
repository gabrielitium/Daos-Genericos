package mx.gabvax.daog.model.daoImp;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import mx.gabvax.daog.model.HibernateUtil;
import mx.gabvax.daog.model.UnableToSaveException;
import mx.gabvax.daog.model.dao.GenericDao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
 
 
 
public class GenericDaoImpl<Entity, K extends Serializable> implements GenericDao<Entity, K> {
 
 public Class<Entity> domainClass = getDomainClass();
 private Session session;
  
 protected Class getDomainClass() {
   if (domainClass == null) {
   ParameterizedType thisType = (ParameterizedType) getClass()
     .getGenericSuperclass();
   domainClass = (Class) thisType.getActualTypeArguments()[0];
   }
  return domainClass;
 }
  
 private Session getHibernateTemplate() {
  session = HibernateUtil.getSessionFactory().openSession();
  session.beginTransaction();
  return session;
 }
  
 public Entity Buscar(K id) {
  Entity returnValue = (Entity) getHibernateTemplate().load(domainClass, id);
  session.getTransaction().commit();
  return returnValue;
 }
  
 public void Guardar(Entity t) throws UnableToSaveException {
   try {
    getHibernateTemplate().save(t);
    session.getTransaction().commit();
   } catch (HibernateException e) {
   throw new UnableToSaveException(e);
   }
 }
public void Modificar(Entity t) throws UnableToSaveException {
	// TODO Auto-generated method stub
	  try {
		   getHibernateTemplate().update(t);
		    session.getTransaction().commit();
		   } catch (HibernateException e) {
		    throw new UnableToSaveException(e);
		  }
}

public void Borrar(Entity t) {
	// TODO Auto-generated method stub
	 getHibernateTemplate().delete(t);
	   session.getTransaction().commit();
}
}
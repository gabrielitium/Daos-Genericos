package mx.gabvax.daog.model.dao;

import java.util.ArrayList;
import java.util.List;
 
import mx.gabvax.daog.model.Cursos;
import mx.gabvax.daog.model.HibernateUtil;
import mx.gabvax.daog.model.daoImp.GenericDaoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
 
public class CursoDAO extends GenericDaoImpl<Cursos, Long> implements ICursoDAO {
 
 public List<Cursos> ListarCursos() {
        List<Cursos> users = new ArrayList<Cursos>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            users = session.createQuery("from Curso").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return users;
    }  
 
}
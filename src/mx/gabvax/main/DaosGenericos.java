package mx.gabvax.main;

import org.hibernate.Session;

import mx.gabvax.daog.model.Cursos;
import mx.gabvax.daog.model.HibernateUtil;

public class DaosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Daos gen�ricos");
			 System.out.println("Maven + Hibernate + MySQL");
		        Session session = HibernateUtil.getSessionFactory().openSession();
		        session.beginTransaction();
		        Cursos curso= new Cursos("gram�tica");		    
		        //curso.setNombre("Educaci�n F�sica");
		        session.save(curso);
		        session.getTransaction().commit();
		        System.out.println("Datos guardados");
	}
}

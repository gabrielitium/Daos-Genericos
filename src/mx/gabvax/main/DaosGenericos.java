package mx.gabvax.main;

import org.hibernate.Session;

import mx.gabvax.daog.model.Cursos;
import mx.gabvax.daog.model.HibernateUtil;
import mx.gabvax.daog.service.CursoService;

public class DaosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Daos genéricos");
			 System.out.println("Maven + Hibernate + MySQL");
		        //Session session = HibernateUtil.getSessionFactory().openSession();
		        //session.beginTransaction();
		        //Cursos curso= new Cursos("gramática");		    
		        //curso.setNombre("Educación Física");
		        //session.save(curso);
		        //session.getTransaction().commit();
		        //System.out.println("Datos guardados");
			 
			//ICursoDAO objdao= new CursoDAO();
			  CursoService objdao=new CursoService();
			  Cursos obj = new Cursos();
		        System.out.println("Guardando");
		        obj.setNombre("Curso de Tecnologia J2EE + Hibernate + struts 2");
		        objdao.GuardarCurso(obj);        
		        System.out.println("Listando");
		        for (Cursos iter : objdao.ListarCursos()) {
		            System.out.println(iter.getIdcurso().toString() + " - " + iter.getNombre());
		        }
			  
	}
}

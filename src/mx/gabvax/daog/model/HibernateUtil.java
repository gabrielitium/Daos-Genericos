package mx.gabvax.daog.model;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 
@SuppressWarnings("deprecation")
public class HibernateUtil {
   
    private static SessionFactory sessionFactory = buildSessionFactory();
  
    private static SessionFactory buildSessionFactory() {
    	try {
			Properties prop= new Properties();
			prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/daos_genericos");
			prop.setProperty("hibernate.connection.username", "root");
			prop.setProperty("hibernate.connection.password", "mysql");
			prop.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
			
			sessionFactory = new AnnotationConfiguration()
		   .addPackage("com.concretepage.persistence")
				   .addProperties(prop)
				   .addAnnotatedClass(Cursos.class)
				   .addAnnotatedClass(Alumnos.class)
				   .buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
		return sessionFactory;
    }
  
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
  
    public static void shutdown() {
     // Close caches and connection pools
     getSessionFactory().close();
    }
  
}
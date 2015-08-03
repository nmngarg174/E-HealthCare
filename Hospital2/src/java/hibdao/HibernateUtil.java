

package hibdao;

import entity.*;
//import entity.student;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;   
import org.hibernate.SessionFactory;    

public class HibernateUtil {
    
    private static SessionFactory sessionfactory;
    
    static {
        try{
            
            AnnotationConfiguration cfg=new AnnotationConfiguration();  
            cfg.addAnnotatedClass(Doctor.class);
            cfg.addAnnotatedClass(Login.class);
            cfg.configure();    
            sessionfactory =cfg.buildSessionFactory();  
       
        }catch(Throwable ex){
            System.out.println("error"+ex); 
        }
    }
    public static SessionFactory getSessionFactory(){
       return sessionfactory;    
       }
    
    public static Session getSession(){
        return sessionfactory.openSession();
    }
    
}

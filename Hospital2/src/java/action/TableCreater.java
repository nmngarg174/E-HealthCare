/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package action;

import entity.Doctor;
import entity.Login;
import entity.Message;
import entity.Patient;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author princEvil
 */
public class TableCreater {
   
    public static void main(String[] args) {
        
        AnnotationConfiguration cfg=new AnnotationConfiguration();  
      //  cfg.addAnnotatedClass(Login.class);
        cfg.addAnnotatedClass(Doctor.class);
      //  cfg.addAnnotatedClass(Patient.class);
      //  cfg.addAnnotatedClass(Message.class);
        
        
        cfg.configure();    
        SchemaExport se=new SchemaExport(cfg);  
        se.create(true,true);
        System.out.println("Table Created ");

    }
    
}

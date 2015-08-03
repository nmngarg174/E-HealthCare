/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package action;

import entity.Doctor;
import hibdao.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author princEvil
 */
public class DoctorAdd {
 
    public static void main(String args []){
   addDoctor();   
   //updatemp();
   //viewemp();
   //  viewagregateonemp();
   //viewempcriteria();  
}
public static void addDoctor(){
    Session s=HibernateUtil.getSession();   
    Transaction t=s.beginTransaction(); 
    //employee e=new employee("naman","coding",45655.00f);
    Doctor[] e=new Doctor[36];  
    /*
    e1[0]=new employee("ankur","bakchodi",0);    
    e1[1]=new employee("anku","bakchodi",14324);
    e1[2]=new employee("ank","bakchodi",23244);
    e1[3]=new employee("a","bakchodi",3332);*/
    /*for(employee i:e1){
        s.save(e1); 
        t.commit();
    }*/
      e[0] = new Doctor(102,"9111111111","cardiology","1@gmail.com","male","images/kkkapur.jpg","card/kkkapur.docx","kkkapur");  
      e[1] = new Doctor(102,"9111111112","cardiology","2@gmail.com","male","images/mahesh.jpg","card/mahesh.docx","mahesh");
      e[2] = new Doctor(103,"9111111113","cardiology","3@gmail.com","male","images/prabhu.jpg","card/prabhu.docx","prabhu");
      e[3] = new Doctor(104,"9111111114","cardiology","4@gmail.com","male","images/pradeep.jpg","card/pradeep.docx","pradeep");
      e[4] = new Doctor(105,"9111111115","dermatology","5@gmail.com","male","images/ramji.jpg","derm/ramji.docx","ramji");
      e[5] = new Doctor(106,"9111111116","dermatology","6@gmail.com","male","images/rkjoshi.jpg","derm/rkjoshi.docx","rkjoshi");
      e[6] = new Doctor(107,"9111111117","dermatology","7@gmail.com","male","images/skbose.jpg","derm/skboss.docx","skboss");
      e[7] = new Doctor(108,"9111111118","dermatology","8@gmail.com","male","images/uma.jpg","derm/umashankar.docx","umashankar");
      e[8] = new Doctor(109,"9111111119","endocrinology","9@gmail.com","male","images/batra.jpg","endo/batra.docx","batra");
      e[9] =new Doctor(110,"9111111120","endocrinology","10@gmail.com","male","images/nk.jpg","endo/rknarayan.docx","rknarayan");
      e[10] = new Doctor(111,"9111111121","endocrinology","11@gmail.com","male","images/rp.jpg","endo/rp.docx","rp");
      e[11] = new Doctor(112,"9111111122","endocrinology","12@gmail.com","male","images/sk.jpg","endo/sk.docx","sk");
      e[12] = new Doctor(113,"9111111123","ent","13@gmail.com","male","images/ameet.jpg","ent/ameet.docx","ameet");
      e[13] = new Doctor(114,"9111111124","ent","14@gmail.com","male","images/atul.jpg","ent/atul.docx","atul");
      e[14] = new Doctor(115,"9111111125","ent","15@gmail.com","male","images/girish.jpg","ent/girish.docx","girish");
      e[15] = new Doctor(116,"9111111126","ent","16@gmail.com","male","images/kalpana.jpg","ent/kalpana.docx","kalpana");
      e[16] = new Doctor(117,"9111111127","neurology","17@gmail.com","male","images/anoop.jpg","neuro/anoop.docx","anoop");
      e[17] = new Doctor(118,"9111111128","neurology","18@gmail.com","male","images/mukul.jpg","neuro/mukul.docx","mukul");
      e[18] = new Doctor(119,"9111111129","neurology","19@gmail.com","male","images/pnrenjen.jpg","neuro/p.n..docx","p.n.");
      e[19] = new Doctor(120,"9111111130","neurology","20@gmail.com","male","images/rakesh.jpg","neuro/rakesh.docx","rakesh");
      e[20] = new Doctor(121,"9111111131","oncology","21@gmail.com","male","images/anishmaru.jpg","onco/anishmaru.docx","anishmaru");
      e[21] = new Doctor(122,"9111111132","oncology","22@gmail.com","male","images/shefali.jpg","onco/shefali.docx","shefali");
      e[22] = new Doctor(123,"9111111133","oncology","23@gmail.com","male","images/shishirseth.jpg","onco/shishirseth.docx","shishirseth");
      e[23] = new Doctor(124,"9111111134","oncology","24@gmail.com","male","images/shoaib.jpg","onco/shoaib.docx","shoaib");
      e[24] = new Doctor(125,"9111111135","orthopediatrics","25@gmail.com","male","images/abheek.jpg","ortho/abheek.docx","abheek");
      e[25] = new Doctor(126,"9111111136","orthopediatrics","26@gmail.com","male","images/ajit.jpg","ortho/ajith.docx","ajith");
      e[26] = new Doctor(127,"9111111137","orthopediatrics","27@gmail.com","male","images/akilesh.jpg","ortho/akilesh.docx","akilesh");
      e[27] = new Doctor(128,"9111111138","orthopediatrics","28@gmail.com","male","images/raju.pdf","ortho/raju.docx","raju");
      e[28] = new Doctor(129,"9111111139","pediatrics","29@gmail.com","male","images/anjan.jpg","pedia/anjan.docx","anjan");
      e[29] = new Doctor(130,"9111111140","pediatrics","30@gmail.com","male","images/handa.jpg","pedia/handa.docx","handa");
      e[30] = new Doctor(131,"9111111141","pediatrics","31@gmail.com","male","images/sandeep.jpg","pedia/sandeep.docx","sandeep");
      e[31] = new Doctor(132,"9111111142","pediatrics","32@gmail.com","male","images/sjgupta.jpg","pedia/sjgupta.docx","sjgupta");
      e[32] = new Doctor(133,"9111111143","urology","33@gmail.com","male","images/ajit.jpg","uro/ajit.docx","ajit");
      e[33] = new Doctor(134,"9111111144","urology","34@gmail.com","male","images/anshuman.jpg","uro/anshuman.docx","anshuman");
      e[34] = new Doctor(135,"9111111145","urology","35@gmail.com","male","images/suresh.jpg","uro/suresh.docx","suresh");
      e[35] = new Doctor(136,"9111111146","urology","36@gmail.com","male","images/vipin.jpg","uro/vipin.docx","vipin");
    
    
    for(int i=0;i<35;i++){
        s.save(e[i]);
        
    }
    t.commit();
    //s.save(e);  
    //t.commit(); 
    System.out.print("Data Saved !!");
    }
    
}

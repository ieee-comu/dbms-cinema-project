/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tr.edu.comu.cinema;

import entity.Customer;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * created on Dec 5, 2019 10:40:56 PM
 * @author bayramcicek
 */

public class MainClass {
        static Session session;
        
        public static void insert(Customer c){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx;
        tx = session.beginTransaction();
        session.save(c);
        tx.commit();
//        session.flush();
        session.close();
       
    }
    
    public static void main(String[] args) {
        System.out.println("test yazıldı");
        Customer c = new Customer("user_ben", "1234", "a@b.com", new Date(1,1,2019), "canakkale", "USA");
        System.out.println("test yazıldı");
        insert(c);
        System.out.println("test yazıldı");
        System.exit(0);
        
    }

}

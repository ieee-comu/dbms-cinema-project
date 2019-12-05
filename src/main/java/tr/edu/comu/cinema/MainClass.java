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
    
    public static void delete(Customer c){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx;
        tx = session.beginTransaction();
        session.delete(c);
        tx.commit();
//        session.flush();
        session.close();
       
    }
       
    
    public static void main(String[] args) {
//        Customer c = new Customer("user_ben", "1234", "a@b.com", new Date(1,1,2019), "canakkale", "USA");
//        insert(c);

//        Customer c = new Customer("user_ben", "1234", "a@b.com", new Date(1,1,2019), "canakkale", "USA");
//        delete(c);
        session = HibernateUtil.getSessionFactory().openSession();
        Object o = session.load(Customer.class, "user10");
        Customer c = (Customer)o;
        
        Transaction tx;
        tx = session.beginTransaction();
        c.setAddress("ankara");
        tx.commit();
        session.close();

        System.exit(0);
        
    }

}

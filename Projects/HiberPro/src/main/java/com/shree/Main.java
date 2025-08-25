package com.shree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.setRollNo(113);
        s1.setsName("Mahesh");
        s1.setsAge(22);

        Student s2 = null;

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClasses(com.shree.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();


        Session session = sf.openSession();

        System.out.println("select :/n 1.Create /n 2.Select /n 3.Update /n 4.Delete");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                Transaction transaction = session.beginTransaction();
                session.persist(s1);
                transaction.commit();
                break;
            case 2 :
                s2 = session.get(Student.class, 101);
                System.out.println(s2);
                break;
            case 3 :
                Transaction transaction2 = session.beginTransaction();
                session.merge(s1);
                transaction2.commit();
                break;
            case 4 :
                Transaction transaction3 = session.beginTransaction();
                s2 = session.get(Student.class, 101);
                session.remove(s2);
                transaction3.commit();
                break;

        }
/*
        //transaction is required for create,update and delete
        Transaction transaction = session.beginTransaction();
        /*create*/
        /*for update change methode persist to merge
        session.persist(s1);
        transaction.commit();
        session.persist(s1);
        transaction.commit();
        */
        //Select
        /*
        s2 = session.get(Student.class, 102);
        */
        //delete
        /*
        s2 = session.get(Student.class, 102);
        session.remove(s2);
        transaction.commit();
        */

        session.close();
        sf.close();

        //System.out.println(s2);
    }
}
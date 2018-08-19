package com.cdb.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.Service;

import java.util.List;
import java.util.Random;


public class App
{
    public static void main( String[] args )
    {
        Game a =null;

        Configuration con = new Configuration().configure()
                .addAnnotatedClass(Game.class);

//                .addAnnotatedClass(Brand.class);
//        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();
        Random r = new Random();


//        ---#Loop to add data into DB#----
//        for(int i=5;i<=10;i++)
//        {
//            Game g = new Game();
//            g.setGid(i);
//            g.setGname("Name " + i);
//            g.setPlatform(GetData.platform());
//            g.setPrice(GetData.price());
//            session.save(g);
//        }


//        Query q = session.createQuery("from Game");   //List all data from db;
        Query q = session.createQuery("from Game where price >100");

        List<Game> games = q.list();

        for(Game g :games)
        {
            System.out.println(g);
        }


        session.getTransaction().commit();
        session.close();





//        ---<Hibernate caching Test Start>---
//
//        session1.beginTransaction();
//        Query q1 = session1.createQuery("from Game as g where g.gid =1");
//        q1.setCacheable(true);
//        a = (Game) q1.uniqueResult();
//        System.out.println(a);
//        session1.getTransaction().commit();
//        session1.close();
//        Session session2 = sf.openSession();
//        session2.beginTransaction();
//        Query q2 = session2.createQuery("from Game as g where g.id=1");
//        q2.setCacheable(true);
//        a=(Game)q2.uniqueResult();
//        System.out.println(a);
//        session2.getTransaction().commit();
//        session2.close();
//
//        ---<Hibernate caching Test End>---

//        session1.get(Game.class, 2);  // Fetching data from database;


    }
}

package com.cdb.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;


public class App 
{
    public static void main( String[] args )
    {
        Record ora = new Record();
        ora.setArticle(13);
        ora.setDealer("EVA");
        ora.setPrice(1000);


        Configuration con = new Configuration().configure().addAnnotatedClass(Record.class);

//        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(ora);

        tx.commit();




    }
}

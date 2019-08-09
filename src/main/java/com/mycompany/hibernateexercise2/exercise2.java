/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernateexercise2;

import com.mycompany.hibernateexercise2.HelloWorld;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author vishal
 */
public class exercise2 {

    public static void main(String[] args) {
        Configuration con = new Configuration().configure().addAnnotatedClass(HelloWorld.class);
        SessionFactory sf = con.buildSessionFactory();
        exercise2 e2 = new exercise2();
        e2.addMessage(sf);
    }

    public void addMessage(SessionFactory sf) {
        Session session = sf.openSession();
        session.beginTransaction();
        HelloWorld hm = new HelloWorld(2, "Hello world hibernate API");
        session.save(hm);
        session.getTransaction().commit();
        sf.close();
    }
}

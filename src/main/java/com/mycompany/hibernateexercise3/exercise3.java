/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernateexercise3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author vishal
 */
public class exercise3 {

    public static void main(String[] args) {
        Configuration con = new Configuration().configure().addAnnotatedClass(Userprofile.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();
        Userprofile up = new Userprofile(2, "vishal", "vishalsoni611@gmail.com", 9429707486L);
        session.save(up);
        session.getTransaction().commit();
        sf.close();
    }
}

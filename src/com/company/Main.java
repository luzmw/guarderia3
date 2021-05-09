package com.company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String[] args) {



        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            System.out.println("Animales en mi base: ");
            List<Animal> animales = (List<Animal>) session.createQuery("FROM Animal").list();
            for (Animal a : animales) System.out.println(a);
        }
    }
}



package com.saruman.util;


import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    public static Transaction transacao;

    public static SessionFactory getSessionFactory() throws MappingException {
        if (sessionFactory == null) {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }

    public static Session getSession() {
        return getSessionFactory().openSession();
    }

}

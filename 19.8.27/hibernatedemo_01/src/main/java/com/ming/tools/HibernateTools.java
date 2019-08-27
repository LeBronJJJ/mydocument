package com.ming.tools;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 获取Hibernate的API
 *
 * SessionFactory------>配置数据库
 * Session---->操作数据库执行增删改查
 * Configuration---->创建hibernate的SessionFactory
 */
public class HibernateTools {


    private static SessionFactory sessionFactory = null;

    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    //获取SessionFactory
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    //执行CRUD操作，需要Session
    public static Session getSession(){
        return sessionFactory.openSession();
    }

    //执行完毕后，关闭session
    public static void closeSession(Session session){
        if(session.isOpen()){
            session.close();
        }
    }

}

package com.ming;


import com.ming.po.UserInfo;
import com.ming.tools.HibernateTools;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;

public class HibernateTest {


    private SessionFactory sessionFactory = null;

    @Before
    public void testInitativeMethod(){
        sessionFactory = HibernateTools.getSessionFactory();
    }

    /**
     * 真正执行CRUD操作 Session
     */
    @Test
    public void testAddUserInfo(){
        Session session = HibernateTools.getSession();
        try{

            //开启事务：
            session.getTransaction().begin();


            UserInfo userInfo = new UserInfo();
            userInfo.setUserName("arvin");
            userInfo.setUserPass("123");
            //执行操作
            session.save(userInfo);// insert语句

            //提交事务
            session.getTransaction().commit();


        }catch (Exception ex){
            ex.printStackTrace();
            //回滚事务
            session.getTransaction().rollback();
        }finally {
            //关闭session
            HibernateTools.closeSession(session);
        }
    }
}

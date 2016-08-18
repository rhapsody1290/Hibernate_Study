package cn.apeius.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Asus on 2016/8/17.
 */
final public class HibernateUtil { //SqlHelper
    private static SessionFactory sessionFactory = null;
    //使用线程局部模式
    private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

    static {
        sessionFactory=new Configuration().configure().buildSessionFactory();
    }

    private HibernateUtil(){}

    //获取全新的全新的sesession
    public static Session openSession(){
        return sessionFactory.openSession();
    }
    //获取和线程关联的session
    public static Session getCurrentSession(){
        Session session = threadLocal.get();
        //判断是否得到
        if(session == null){
            session = sessionFactory.openSession();
            //把session对象设置到 threadLocal,相当于该session已经和线程绑定
            threadLocal.set(session);
        }
        return session;
    }
}


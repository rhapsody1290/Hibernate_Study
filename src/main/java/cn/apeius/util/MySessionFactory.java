package cn.apeius.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Asus on 2016/8/16.
 */
//单例模式
public class MySessionFactory {
    private MySessionFactory(){}
    private static class HoldClass{
        private static final SessionFactory instance = new Configuration().configure().buildSessionFactory();
    }
    public static SessionFactory getInstatnce(){
        return HoldClass.instance;
    }
}

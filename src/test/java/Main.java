import cn.apeius.domain.Employee;
import cn.apeius.util.HibernateUtil;
import cn.apeius.util.MySessionFactory;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

import java.util.List;

/**
 * Created by Asus on 2016/8/16.
 */
public class Main {
    public static void main(String[] args){
        Session session = HibernateUtil.getCurrentSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            //do...
            Criteria cri = session.createCriteria(Employee.class)
                    .setMaxResults(2)
                    .addOrder(Order.asc("id"));
            List<Employee> list = cri.list();
            for(Employee e : list){
                System.out.println(e.getId() + " " + e.getName());
            }
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            throw new RuntimeException(e.getMessage());
        }finally {
            if(session != null && session.isOpen()){
                session.close();
            }
        }
    }
    //快速入门
    public static void addEmployee() {
        //1、创建configuration，该对象用于读取hibernate.ctf.xml，并完成初始化
        Configuration configuration = new Configuration().configure();
        //2、创建sessionFactory，这是一个会话工厂
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        System.out.println("sessionFactory:" + sessionFactory);
        //3、创建session，相当于jdbc connection
        Session session = sessionFactory.openSession();
        //4、在进行增加、删除、修改的时候使用事务提交
        Transaction transaction = session.beginTransaction();
        //添加一个雇员
        Employee employee = new Employee();
        employee.setName("qm1");
        employee.setEmail("qm1@126.com");
        employee.setHiredate(new java.util.Date());
        //保存
        session.save(employee);
        //提交
        transaction.commit();
        session.close();
    }

    //模版
    public static void updateEmployee() {
        //获取一个会话
        Session session = MySessionFactory.getInstatnce().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            //do...
            //修改用户1、获得要修改的对象2、修改
            //load是通过主键属性，获取该对象实例
            Employee employee = (Employee) session.load(Employee.class,3);//产生select .. where id = 2
            employee.setName("钱明");//这句话会产生update语句
            //出现异常
            //int i = 9/0;
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            throw new RuntimeException(e.getMessage());
        }finally {
            //关闭session
            if(session != null && session.isOpen()){
                session.close();
            }
        }
    }

    public static void deleteEmployee() {
        //获取一个会话
        Session session = MySessionFactory.getInstatnce().openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = (Employee) session.load(Employee.class,2);
        session.delete(employee);
        transaction.commit();
        session.close();
    }




}

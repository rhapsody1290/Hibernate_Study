package cn.apeius.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Asus on 2016/8/16.
 */
public class Employee implements Serializable{
    private Integer id;
    private String name;
    private String email;
    private  java.util.Date hiredate;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

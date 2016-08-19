package cn.apeius.domain;

import java.util.Collection;

/**
 * Created by Asus on 2016/8/19.
 */
public class Student {
    private int sid;
    private String sname;
    private String ssex;
    private String sdept;
    private Integer sage;
    private String saddress;
    private Collection<Studcourse> stucourses;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (sid != student.sid) return false;
        if (sname != null ? !sname.equals(student.sname) : student.sname != null) return false;
        if (ssex != null ? !ssex.equals(student.ssex) : student.ssex != null) return false;
        if (sdept != null ? !sdept.equals(student.sdept) : student.sdept != null) return false;
        if (sage != null ? !sage.equals(student.sage) : student.sage != null) return false;
        if (saddress != null ? !saddress.equals(student.saddress) : student.saddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (ssex != null ? ssex.hashCode() : 0);
        result = 31 * result + (sdept != null ? sdept.hashCode() : 0);
        result = 31 * result + (sage != null ? sage.hashCode() : 0);
        result = 31 * result + (saddress != null ? saddress.hashCode() : 0);
        return result;
    }

    public Collection<Studcourse> getStucourses() {
        return stucourses;
    }

    public void setStucourses(Collection<Studcourse> stucourses) {
        this.stucourses = stucourses;
    }
}

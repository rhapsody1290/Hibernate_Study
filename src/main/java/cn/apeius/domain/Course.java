package cn.apeius.domain;

import java.util.Collection;

/**
 * Created by Asus on 2016/8/19.
 */
public class Course {
    private int cid;
    private String cname;
    private Integer ccredit;
    private Collection<Studcourse> studcourses;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCcredit() {
        return ccredit;
    }

    public void setCcredit(Integer ccredit) {
        this.ccredit = ccredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (cid != course.cid) return false;
        if (cname != null ? !cname.equals(course.cname) : course.cname != null) return false;
        if (ccredit != null ? !ccredit.equals(course.ccredit) : course.ccredit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (cname != null ? cname.hashCode() : 0);
        result = 31 * result + (ccredit != null ? ccredit.hashCode() : 0);
        return result;
    }

    public Collection<Studcourse> getStudcourses() {
        return studcourses;
    }

    public void setStudcourses(Collection<Studcourse> studcourses) {
        this.studcourses = studcourses;
    }
}

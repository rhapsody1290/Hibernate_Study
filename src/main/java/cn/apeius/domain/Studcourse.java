package cn.apeius.domain;

/**
 * Created by Asus on 2016/8/19.
 */
public class Studcourse {
    private int stuCourseId;
    private int grade;
    private Course course;
    private Student student;

    public int getStuCourseId() {
        return stuCourseId;
    }

    public void setStuCourseId(int stuCourseId) {
        this.stuCourseId = stuCourseId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Studcourse that = (Studcourse) o;

        if (stuCourseId != that.stuCourseId) return false;
        if (grade != that.grade) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stuCourseId;
        result = 31 * result + grade;
        return result;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

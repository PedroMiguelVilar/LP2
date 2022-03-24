package edu.ufp.inf.lp2._03_Course;

import edu.ufp.inf.lp2._02_Collections.LottoBagArray;
import edu.ufp.inf.lp2._03PL.Date;

import java.util.ArrayList;

public class Student {

    private long number;
    private Date registration;
    private String email;
    private String password;
    private ArrayList<Grade> grades = new ArrayList<>();
    private CourseClass courseClass;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public CourseClass getCourseClass() {
        return courseClass;
    }

    public void setCourseClass(CourseClass courseClass) {
        this.courseClass = courseClass;
    }

    public Student(long number, Date registration, String email, String password) {
        this.number = number;
        this.registration = registration;
        this.email = email;
        this.password = password;
    }


    public void addGrade(Grade g) {
        for (Grade o : grades)
            if (o != g)
                grades.add(g);
    }

    public void removeGrade(float g, String nd, Date d) {
        for (Grade o : grades) {
            if (nd.equals(o.getDiscipline().getName())) {
                if (g == o.getGrade()) {
                    grades.remove(o);
                }
            }
        }
    }

    public Grade changeGrade(float ng, float og, String nd, Date d) {
        for (Grade o : grades) {
            if (nd.equals(o.getDiscipline().getName())) {
                if (og == o.getGrade()) {
                    o.setGrade(ng);
                }
            }
        }
        return null;
    }

    public Grade searchGrade(float g, String nd, Date d) {
        for (Grade o : grades) {
            if (nd.equals(o.getDiscipline().getName())) {
                if (g == o.getGrade()) {
                    return o;
                }
            }
        }
        return null;
    }

    public float averageGrades() {
        float resultado = 0;
        for (Grade o : grades) {
            resultado = o.getGrade();
        }
        return resultado / grades.size();
    }

    public Grade minGrade() {
        float min = 999;
        Grade g = new Grade();
        for (Grade o : grades) {
            if (min<=o.getGrade()){
                min=o.getGrade();
                g.setGrade(min);
            }
        }
        return g;
    }

    public Grade maxGrade() {
        float max = -999;
        Grade g = new Grade();
        for (Grade o : grades) {
            if (max>=o.getGrade()){
                max=o.getGrade();
                g.setGrade(max);
            }
        }
        return g;
    }

    public void registerInCourseClass(CourseClass cc) {
        this.courseClass = cc;
    }

    public CourseClass unregisterFromCourseClass() {
        return null;
    }

}

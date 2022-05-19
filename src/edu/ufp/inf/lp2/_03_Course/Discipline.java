package edu.ufp.inf.lp2._03_Course;

import edu.ufp.inf.lp2._03PL.Date;

import java.util.ArrayList;


public class Discipline {

    private String name;
    private int ects;
    private short courseSemester;
    private short courseYear;
    private ArrayList<Grade> grades = new ArrayList<>();

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getEcts() { return ects; }

    public void setEcts(int ects) { this.ects = ects; }

    public short getCourseSemester() { return courseSemester; }

    public void setCourseSemester(short courseSemester) { this.courseSemester = courseSemester;}

    public short getCourseYear() { return courseYear; }

    public void setCourseYear(short courseYear) { this.courseYear = courseYear; }

    public ArrayList<Grade> getGrades() { return grades; }

    public void setGrades(ArrayList<Grade> grades) { this.grades = grades; }

    public Discipline(String name, int ects, short courseSemester, short courseYear) {
        this.name = name;
        this.ects = ects;
        this.courseSemester = courseSemester;
        this.courseYear = courseYear;
    }

    public boolean containGrade(Grade g) {
        for (Grade o : grades){
            if(o == g)return true;
        }
        return false;
    }

    public void associateGrade(Grade g) {
       if (!containGrade(g)) grades.add(g);
    }

    public float averagegrade() {
        float resultado = 0;
        for (Grade o : grades) {
            resultado = o.getGrade();
        }
        return resultado / grades.size();
    }

}

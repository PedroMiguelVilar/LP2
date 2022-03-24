package edu.ufp.inf.lp2._03_Course;

import edu.ufp.inf.lp2._03PL.Date;

public class Grade {

    private float grade;
    private Date date;

    private Discipline discipline;
    private Student student;

    public float getGrade() {
        return grade;
    }

    public void setGrade(float ng) { this.grade = ng; }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public Discipline getDiscipline() { return discipline; }

    public void setDiscipline(Discipline discipline) { this.discipline = discipline; }

    public Discipline associatedDiscipline() { return this.discipline; }

    public void associateDiscipline(Discipline discipline) { this.discipline = discipline; }

    public Student associatedStudent() {
        return this.student; }

    public void associateStudent(Student student) {
        this.student = student;
    }


}

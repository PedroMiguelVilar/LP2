package edu.ufp.inf.lp2._03_Course;

import java.util.ArrayList;

public class CourseClass {
    private String name;
    private ArrayList<Student> student = new ArrayList<>();
    private ArrayList<Discipline> disciplines = new ArrayList<>();

    public boolean containDiscipline(Discipline d) {
        for (Discipline o : disciplines){
            if(o == d)return true;
        }
        return false;
    }

    public void asscociateDiscipline(Discipline d){
        if (!containDiscipline(d)) disciplines.add(d);
    }

    public boolean cointainsregisterStudent(Student s){
        for (Student o : student){
            if(o == s)return true;
        }
        return false;
    }

    public void registerStudent(Student s){
        if (!cointainsregisterStudent(s)) student.add(s);
        s.registerInCourseClass(this);
    }

    public Student unregisterStudent(Student s){
       return null;
    }

    public void searchDiscipline(String name){
        int i;
        for (Discipline d : disciplines){
             i=name.compareTo(d.getName());
             if(i==0)System.out.println("Encontrada!" + d.getName());
        }
    }

    public Student searchStudent(long number){
        for (Student o : student){
            if (o.getNumber()==number){
                return o;
            }
        }
        return null;
    }

    public Student searchStudent(String name){
        for (Student o : student){
            if (name.equals(o.getNameStudent())){
                return o;
            }
        }
        return null;
    }


}

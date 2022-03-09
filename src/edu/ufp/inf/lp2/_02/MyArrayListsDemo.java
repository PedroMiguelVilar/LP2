package edu.ufp.inf.lp2._02;

import edu.ufp.inf.lp2._01_intro.Point;
import edu.ufp.inf.lp2._01_intro.Rectangle;

import java.util.ArrayList;

public class  MyArrayListsDemo {

    public static void testGenerifiedArraysList(){

        ArrayList<String> arrayListString = new ArrayList<String>();

        arrayListString.add("Ola");
        arrayListString.add("Teste!");
        arrayListString.add("Adeus");

        for (String s : arrayListString) System.out.println(s);

        /*
            for (int i = 0;i<arrayListString.size();i++)System.out.println(arrayListString.get(i));
        */
    }

    public static void testRawArrayList(){

        Point point = new Point(0,0);

        ArrayList <Object> arrayList  = new ArrayList<>();

        arrayList.add(new Point(0,0));
        arrayList.add(new Rectangle(point,point));
        arrayList.add("Ola");

        for (Object o : arrayList) {
            System.out.println(o);
        }

        /*
            for (int i = 0; i < arrayList.size(); i++)System.out.println(arrayList.get(i));
        */
    }

    public static void main(String[] args){
        testRawArrayList();
        testGenerifiedArraysList();
    }
}

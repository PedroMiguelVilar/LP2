package edu.ufp.inf.lp2._07_nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileScannerApp {
    public static void main(String[] args) throws IOException {
        Scanner s=null;

        try {
            //Create scanner for txt file
            //The default delimiter is ' ' (whitespace)
            s = new Scanner(new BufferedReader(new FileReader("data/Alunos.txt")));

            s.useDelimiter("\\s*, |\\s*,|\\s*\n");

            //Walk through the file content (token by token) using ' ' as delimiter
            while (s.hasNext()) {
                String token=s.next();
                if (token.contains(",")){
                    String str = token.replace(',', ' ');
                    System.out.println("|"+str.trim()+"|");
                } else {
                    System.out.println("|"+token+"|");
                }
            }

/*
            //We may define delimiters other than whitespace, using regular expressions
            //e.g. "\\s*, " (string followed by ', ') OR "\\s*," (string followed by ',') OR "\\s*\n" (string followed by '\n')
            s.useDelimiter("\\s*, |\\s*,|\\s*\n");
            //Walk through the file content (token by token) using regular expressions above
            while (s.hasNext()) {
                String name=s.next();
                System.out.println("name=|"+name+"|");
                int number=s.nextInt();
                System.out.println("number=|"+number+"|");
                //If LOCAL OS float separator is ',' then replace '.' by ','
                name.replace('.', ',');
                float grade=s.nextFloat();
                System.out.println("grade=|"+grade+"|");
            }
*/
        } finally {
            if (s != null) s.close();
        }
    }
}

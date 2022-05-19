/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2._07_nio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rjm
 */
public class FilePrintWriterApp {

    public static void main(String[] args) {
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try {
            File f = new File("data", "Alunos.txt");
            fw = new FileWriter(f);
            System.out.println("FilePrintWriter - main(): encoding = " + fw.getEncoding());
            pw = new PrintWriter(fw);
            //pw = new PrintWriter(new FileWriter(new File("data", "Alunos.txt")));
            
            // Print into to the file
            //...

            // Flush
            pw.flush();
            //...

            //pw.flush();
            //(...)

        } catch (Exception e) {
            System.err.println("FilePrintWriterApp - main(): " + e);
        } finally {
            try {
                // Flush and close
                if (pw!=null) pw.close();
                if (fw!=null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Thread.currentThread().getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

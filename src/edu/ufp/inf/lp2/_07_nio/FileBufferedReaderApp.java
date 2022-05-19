/**
 * @author rmoreira
 */
package edu.ufp.inf.lp2._07_nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class FileBufferedReaderApp {

    // Does not handle IOException - throws it

    public static void main(String[] args) {
        String filename=(args.length == 1 ? args[0] : "data/Alunos.txt");
        File file=null;
        FileReader fr=null;
        BufferedReader br=null;

        try {
            /*
            file=new File(filename);
            fr=new FileReader(file);
            System.out.println("FileBufferedReaderApp - main(): encoding = " + fr.getEncoding());
            br=new BufferedReader(fr);
            */
            br = new BufferedReader(new FileReader(new File(filename)));

            // Read lines from file
            String line="";
            int line_count=1, bcount=0;
            //byte[] b = new byte[(int)file.length()];
            while ((line=br.readLine()) != null) {
                System.out.println("Linha " + (line_count++) + ": " + line);
                //byte[] baux = line.getBytes();
                //System.arraycopy(baux, 0, b, bcount, baux.length);
                int tokenCount=0;
                String name=null;
                int number=0;
                float grade=0.0f;
                StringTokenizer st=new StringTokenizer(line, ",");
                //while...

                System.out.println("FileBufferedReaderApp main(): read = " + name + "," + number + "," + grade);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Thread.currentThread().getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
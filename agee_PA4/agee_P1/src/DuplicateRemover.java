import java.util.Scanner;
import java.io.File;
import java.util.HashSet;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.ArrayList;


public class DuplicateRemover {
    HashSet<String> uniqueWords;

    public DuplicateRemover() {

        uniqueWords = new HashSet<>();

    }
    public void remove(String dataFile){

       try {
           Scanner scnr = new Scanner(new File(dataFile));

           while (scnr.hasNext()) {
                uniqueWords.add(scnr.next());
           }
       }
       catch(FileNotFoundException other){
           System.out.print(other);
       }
       finally{
           System.out.println("reading. . .");
       }
    }

    public void write(String outputFile) {

        try {
            PrintWriter print1 = new PrintWriter(new File(outputFile));

            for (String string: uniqueWords) {

                //print1.addAll(Arrays.asList(string)); I think this doesnt work because its in the HashSet still.
                //this is cleaner I guess.

                print1.println(string);

            }
            print1.flush();
        } catch (FileNotFoundException other1) {
            System.out.println(other1);
        }
        finally{
            System.out.println("All duplicates have been separated!");
        }
    }

}

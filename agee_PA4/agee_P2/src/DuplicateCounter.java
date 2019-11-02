import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.*;
import java.util.ArrayList;


public class DuplicateCounter {
    HashMap<String, Integer> wordCounter;

    public DuplicateCounter() {

        wordCounter = new HashMap<>();

    }
    public void count(String dataFile){
        Scanner scnr = null;
        try {
            scnr = new Scanner(new File(dataFile));

        }
        catch(FileNotFoundException other){
            System.out.print(other);
        }
        finally{
            System.out.println("reading. . . .");
        }

        while(scnr.hasNext()){
            String thing = scnr.next().toLowerCase();
            Integer count = wordCounter.get(thing);
            if(count == null){
                count = 1;
            }
            else{
                count = ++count;
            }
            wordCounter.put(thing, count);
        }

    }

    public void write(String outputFile) {

        try {
            PrintWriter print1 = new PrintWriter(new File(outputFile));

            for (String string: wordCounter.keySet()) {

                print1.println(string + " " + wordCounter.get(string));

            }
            print1.flush();
        } catch (FileNotFoundException other1) {
            System.out.println(other1);
        }
        finally{
            System.out.println("All duplicates have been counted!");
        }
    }

}

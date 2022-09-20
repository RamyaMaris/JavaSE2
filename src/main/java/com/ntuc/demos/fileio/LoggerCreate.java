
package com.ntuc.demos.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class LoggerCreate {
    public static void main(String[] args) {
        LocalDateTime timenow = LocalDateTime.now();
        ArrayList<String> ar = new ArrayList<>();
        
        try {
            FileWriter fw = new FileWriter(".\\log.txt",true);
            ar.add("One");
            fw.write("\n"+" Value added to the list "+ timenow);
            ar.add("Two");
            fw.write("\n"+" Value added to the list "+ timenow);
            ar.add("Three");
            fw.write("\n"+" Value added to the list "+ timenow);
            ar.add("Four");
            fw.write("\n"+" Value added to the list "+ timenow);
            ar.add("Five");
            fw.write("\n"+" Value added to the list "+ timenow);
            ar.add("Six");
            fw.write("\n"+" Value added to the list "+ timenow);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}

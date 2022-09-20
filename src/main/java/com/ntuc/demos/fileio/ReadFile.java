
package com.ntuc.demos.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File myFile = new File("d:\\javafileio\\newfile.txt");
        try {
            Scanner read = new Scanner(myFile);
            while(read.hasNextLine()){
                System.out.println(read.nextLine());
            }
            read.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}

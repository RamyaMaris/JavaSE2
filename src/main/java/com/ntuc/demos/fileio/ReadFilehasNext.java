package com.ntuc.demos.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFilehasNext {

    public static void main(String[] args) {
        File myFile = new File("d:\\javafileio\\newfile1.txt");
        try {
            Scanner read = new Scanner(myFile);
            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
            read.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("--------------------------------------");
        File myFile1 = new File("d:\\javafileio\\newfile1.txt");
        try {
            Scanner read = new Scanner(myFile1);
            while (read.hasNext()) {
                System.out.println(read.next());
            }
            read.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

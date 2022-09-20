
package com.ntuc.demos.fileio;

import java.io.File;


public class CheckIfDirectory {
     public static void main(String args[]) {
//        File myFile = new File("d:\\javaio\\samples");
        File myFile = new File("d:\\javaio\\new.txt");
        if (myFile.isDirectory()) {
            System.out.println("The path points to a folder");
        } else if (myFile.isFile()) {
            System.out.println("The path points to a file");
        }
    }
}

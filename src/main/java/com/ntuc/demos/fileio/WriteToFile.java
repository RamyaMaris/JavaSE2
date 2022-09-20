
package com.ntuc.demos.fileio;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileWriter fw = new FileWriter("d:\\javafileio\\newfile1.txt");
        fw.write("This is a sample text being written using Java file io");
        fw.write("""
                 
                 This is another sample text being written using java file io.
                 This is scond line in the text file.
                 """);
        fw.close();
        System.out.println("Write succeeded.");
    }
 
}

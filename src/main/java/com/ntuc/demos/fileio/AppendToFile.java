
package com.ntuc.demos.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter(".\\javafileio\\newfile.txt", true);
            fw.write("""
                     \nThis is a sample text being appended using Java File io""");
            fw.close();
            System.out.println("Append succeeded");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


package com.ntuc.demos.fileio;

import java.io.File;

public class CreateNestedDirectories {
    public static void main(String[] args) {
        File myFile = new File("d:\\Javaio\\samples");
        if(!myFile.exists())
        {
            myFile.mkdirs();
            System.out.println("Directories Created.");
        }
        else
        {
            System.out.println("Directories exists");
        }
    }
}

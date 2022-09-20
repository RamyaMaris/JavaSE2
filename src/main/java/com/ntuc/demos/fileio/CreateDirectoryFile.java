
package com.ntuc.demos.fileio;

import java.io.File;
import java.io.IOException;

public class CreateDirectoryFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("d:\\javafileio");
            File myFile1 = new File("d:\\javafileio\\newfile.txt");
        if(!myFile.exists())
        {
            myFile.mkdir();
            System.out.println("Directory Created");
            if(myFile1.createNewFile())
            {
                System.out.println(myFile1.getName()+" created file.");
            }
            else
            {
                System.out.println(myFile1.getName()+" Exist already.");
                
            }
        }
        else
        {
            System.out.println("Directory exists");
            if(myFile1.createNewFile())
            {
                System.out.println(myFile1.getName()+" created file.");
            }
            else
            {
                System.out.println(myFile1.getName()+" Exist already.");
                
            }
        }
    }
}

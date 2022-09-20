
package com.ntuc.demos.fileio.fileoperation;

import java.io.File;


public class RenameFile {
    public static void main(String[] args) {
        File myFile = new File("d:\\javafileio\\newfile.txt");
        if(myFile.exists())
        {
            myFile.renameTo(new File("d:\\javafileio\\newfile2.txt"));
            
//            myFile.renameTo(new File(""));
                  
        }
        else
        {
            System.out.println("File does not exist");
        }
        
    }
}

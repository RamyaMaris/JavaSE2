
package com.ntuc.demos.fileio.fileoperation;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("d:\\Javaio\\samples\\Newfile.txt");
        if (myFile.exists()) {
            myFile.delete();
            System.out.println(myFile.getName() + " deleted ");
        }
        else{
            System.out.println("File not found");
        }
    }
}

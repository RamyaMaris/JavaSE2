
package com.ntuc.demos.fileio.fileoperation;

import java.io.File;

public class ListDirectory {
    public static void main(String[] args) {
        File myFile = new File("d:\\javaio\\samples");
        if(myFile.isDirectory())
        {
            String[] files = myFile.list();
                System.out.println(myFile.getName());
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        }
    }
}

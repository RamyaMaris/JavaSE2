
package com.ntuc.demos.fileio.fileoperation;

import java.io.File;

public class DeleteDirectory {
    public static void main(String[] args) {
         File myFile = new File("d:\\javaio\\samples1");
         if(deleteDir(myFile)){
             System.out.println("Directory deleted");
         }
    }
 
     public static boolean deleteDir(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    deleteDir(files[i]);
                } else {
                    files[i].delete();
                }
            }
        }
        return dir.delete();
    }
}

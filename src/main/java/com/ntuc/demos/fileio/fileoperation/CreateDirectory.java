
package com.ntuc.demos.fileio.fileoperation;

import java.io.File;

public class CreateDirectory {
    public static void main(String args[]) {
        File myFile = new File("d:\\javaiosamples\\text.xml");
        if (!myFile.exists()) {
            myFile.mkdir();
            System.out.println("Directory Created");
        }
        else
        {
            System.out.println("Directory exists");
        }
    }
}

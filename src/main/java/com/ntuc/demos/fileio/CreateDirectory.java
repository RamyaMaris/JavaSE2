
package com.ntuc.demos.fileio;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File myFile = new File("d:\\Javaiiosamples");
        if(!myFile.exists())
        {
            myFile.mkdir();
            System.out.println("Directory Created");
            
        }
        else
        {
            System.out.println("Directory exists");
        }
    }
}

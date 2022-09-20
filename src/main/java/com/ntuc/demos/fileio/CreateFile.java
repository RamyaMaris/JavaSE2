
package com.ntuc.demos.fileio;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateFile {
    public static void main(String[] args) {
        try {
            // create new file return boolean
//            File myfile = new File(".\\javafileio\\newfile.txt");
            File myfile = new File(".\\javafileio\\newfile.xml");
            if(myfile.createNewFile()){
                System.out.println(myfile.getName() +" Created ");
            }
            else
            {
                System.out.println(myfile.getName() +" Exists ");
                
            }
        } catch (IOException ex) {
            Logger.getLogger(CreateFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

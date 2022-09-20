package com.ntuc.demos.fileio.buffered;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadImage {

    public static void main(String[] args) {
        File file = new File("sample.jpg");
        try {
            FileInputStream fin = new FileInputStream(file);
            long size = file.length();
            byte[] ba = new byte[(int) size];
            fin.read(ba);
            fin.close();

            //writing to a new file
            DataOutputStream dos = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    new File("output.jpg"))));
            dos.write(ba);
            dos.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ieo) {
            System.out.println(ieo.getMessage());
        }
    }
}

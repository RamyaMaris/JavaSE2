
package com.ntuc.demos.fileio.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReadDemo {
    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = br.readLine())!=null)
            {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ieo) {
            System.out.println(ieo.getMessage());
        }
    }
}

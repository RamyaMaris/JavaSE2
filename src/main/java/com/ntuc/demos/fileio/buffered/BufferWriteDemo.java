
package com.ntuc.demos.fileio.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferWriteDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write("This is a sample text");
            bw.write("\n"+"This is another sample text:");
            System.out.println("Enter the some text: ");
            String str = scan.nextLine();
            bw.write("\n"+ str + "\n");
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

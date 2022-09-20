
package assessment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanInteractive1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        str = scan.next();
        File myFile = new File(".\\"+str+".txt");
        try{
//            
//            args[0] = scan.next();
//            str = args[0];
//            System.out.println(str);

        Scanner read = new Scanner(myFile);
        
            while(read.hasNextLine()){
                System.out.println(read.nextLine());
            }
            
            
            read.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
       catch(ArrayIndexOutOfBoundsException ae)
       {
           System.out.println(ae.getMessage());
       }
    }
    public static void countToken(){
        
    }
}

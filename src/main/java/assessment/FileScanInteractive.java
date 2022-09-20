
package assessment;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 

 
 public class FileScanInteractive {

    public static void main(String[] args) {
        countToken();
    }

    static public void countToken() {
        String fileName;
        String searchStr;
        int searchCount = 0;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter the file name: ");
            fileName = scan.next();
            File myFile = new File(".\\"+fileName + ".txt");
            Scanner read = new Scanner(myFile);
            while(read.hasNextLine()){
                System.out.println(read.nextLine());
            }
            
            System.out.println("Searching through the file: "+ myFile);
            System.out.println("Enter the search string / q to exit: ");
            searchStr = scan.next();
            if (!searchStr.equalsIgnoreCase("q")) {
            while (read.hasNext()) {
                if(read.next().equalsIgnoreCase(searchStr))
                      searchCount++;
            }
            read.close();
            System.out.println("The word \"" + searchStr + "\" appears " + searchCount + " times in the file");
            searchCount = 0;
            }
            else {
                    System.out.println("You have selected to exit the program. Thank you.");
                    }
        }catch (IOException ex) {
            System.out.println("error code -1");
            System.out.println("Usage: java ScanFuleInteractive question1.txt");
        }
    }
 }
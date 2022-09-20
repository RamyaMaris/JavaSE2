
package com.ntuc.demos.JDBC;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class UseMySql {
    public static Connection useDb(String str)
    {
         Connection conn = null;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException cne) {
            System.out.println("MySQL driver not found" + cne.getMessage());
            return null;
        }
        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+str, "root", "root");
             logFile( " Database acceced at ");
//System.out.println("MySQL Connection established");
            return conn;
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } 
    return null;
    }
    public static void logFile(String str)
    {
        LocalDateTime timenow = LocalDateTime.now();
       
        try {
            FileWriter fw = new FileWriter(".\\logDatabase.txt",true);
            fw.write("\n"+str+ timenow);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void logFilePrepared(String str)
    {
        LocalDateTime timenow = LocalDateTime.now();
       
        try {
            FileWriter fw = new FileWriter(".\\logDatabase1.txt",true);
            fw.write("\n"+str+ timenow);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
   
}

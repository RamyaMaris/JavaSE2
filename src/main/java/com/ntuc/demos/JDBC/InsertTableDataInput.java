
package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTableDataInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int employ_id = scan.nextInt();
        
        Connection conn = UseMySql.useDb("employees");
        try {
            Statement stmt = conn.createStatement();
            stmt.execute("insert into employees values"
            + "(210,'bill','gates','bgs@ms.com',555555,'1987-10-10',8,5000,101,4)");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            
            try {
                conn.close();
            } catch (SQLException se) {
                System.out.println(se.getMessage());
            }
        }
    }
            
}


package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadTableData {
    static Connection conn;
    static ResultSet rs,rs1;
    public static void main(String[] args) {
        conn = UseMySql.useDb("employees");
        try {
            Statement stmt = conn.createStatement();
  
rs = stmt.executeQuery("select * from employees");
            System.out.printf("%-5s\t%-10s\t%-10s\t%-15s\t%-15s\n", "-----","----------","----------","----------","----------------");
                System.out.printf("%-5s\t%-10s\t%-10s\t%-15s\t%-15s\n", "ID","FirstName","LastName","Salary","Email ID");
                System.out.printf("%-5s\t%-10s\t%-10s\t%-15s\t%-15s\n", "-----","----------","----------","----------","----------------");
                
            while (rs.next()) {
//                System.out.println(rs.getInt("employee_id")
//                        + " -- " + rs.getString("first_name")
//                        + " " + rs.getString(3)
//                        + "--\t" + rs.getString(8)
//                        + "--\t" + rs.getString("email"));
                 System.out.printf("%-5s\t%-10s\t%-10s\t%-15s\t%-15s\n",rs.getInt("employee_id"),rs.getString("first_name"),rs.getString(3),rs.getDouble(8),rs.getString("email"));
            }
             rs1 = stmt.executeQuery("select count(*) from employees");
             rs1.next();
            System.out.println(rs1.getInt(1)+" rows selected");
        
//             rs.last();
//            System.out.println(rs.getRow());

        
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } finally {
            try {
                rs.close();
                conn.close();
            } catch (SQLException se1) {
                System.out.println(se1.getMessage());
            }
        }
    }
}

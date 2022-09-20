
package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReadEmployeeTableData {
    static Connection conn;
    static ResultSet rs;
    public static void main(String[] args) {
        boolean temp = false;
        conn = UseMySql.useDb("employees");
        try {
            Statement stmt = conn.createStatement();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter employee id: ");
            int empl_id = scan.nextInt();
            rs = stmt.executeQuery("select * from employees where employee_id="+empl_id);
//                System.out.printf("%-5s\t%-10s\t%-10s\t%-15s\t%-15s\n", "-----","----------","----------","----------","----------------");
//                System.out.printf("%-5s\t%-10s\t%-10s\t%-15s\t%-15s\n", "ID","FirstName","LastName","Salary","Email ID");
//                System.out.printf("%-5s\t%-10s\t%-10s\t%-15s\t%-15s\n", "-----","----------","----------","----------","----------------");
                
            while (rs.next()) {
                temp = true;
                System.out.println(rs.getInt("employee_id")
                        + " -- " + rs.getString("first_name")
                        + "---" + rs.getString(3)
                        + "---" + rs.getString(8)
                        + "---" + rs.getString(4)
                        + "---" + rs.getString(5)
                        +"---" + rs.getDate(6)
                        +"---" + rs.getInt(7)
                        +"---" + rs.getDouble(8)
                        +"---" + rs.getInt(9)
                        +"---" + rs.getInt(10));
//                 System.out.printf("%-5s\t%-10s\t%-10s\t%-15s\t%-15s\n",rs.getInt("employee_id"),rs.getString("first_name"),rs.getString(3),rs.getDouble(8),rs.getString("email"));
            
            }
            if(temp == false)
            {
                System.out.println("Enter the valid employee id");
            }
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

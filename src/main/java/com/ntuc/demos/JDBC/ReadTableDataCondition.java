
package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReadTableDataCondition {
    static Connection Conn;
    static ResultSet rs;
    static Scanner scan;

    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("employees");
        scan = new Scanner(System.in);
        System.out.println("Please enter the employee number");
        int eno = scan.nextInt();

        try {
            Statement stmt = conn.createStatement();
            String query = "select * from employees where employee_id=" + eno;
            rs = stmt.executeQuery(query);
            if (rs.next() == false) {
                System.out.println("There are no records with "+ eno);
            } else {
                 do{
                    System.out.println(rs.getInt("employee_id")
                            + "---" + rs.getString("first_name")
                            + "---" + rs.getString(3)
                            + "---" + rs.getString(4)
                            + "---" + rs.getString(5)
                            + "---" + rs.getDate(6)
                            + "---" + rs.getInt(7)
                            + "---" + rs.getDouble(8)
                            + "---" + rs.getInt(9)
                            + "---" + rs.getInt(10)
                    );
                }
                 while (rs.next());
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

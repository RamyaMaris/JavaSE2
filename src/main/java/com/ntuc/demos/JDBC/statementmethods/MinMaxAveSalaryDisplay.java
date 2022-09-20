
package com.ntuc.demos.JDBC.statementmethods;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class MinMaxAveSalaryDisplay {
    static ResultSet rs;
    
    public static void main(String[] args) {
        Connection conn = UseMySql.useDb("employees");
        try {
//            Statement stmt = conn.createStatement();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
  ResultSet.CONCUR_UPDATABLE);

             /* 
            executeQuery method 
            1. Used to retrieve data from database
            2. Returns a object of ResultSet
            4. throws SQL exception
            5. Used with select statement only
             */
             stmt.executeQuery("select * from employees");
             rs = stmt.executeQuery("select * from departments");
             while(rs.next())
             {
                 System.out.println(rs.getInt("department_id")+"---"+ rs.getString("department_name"));
                 
             }
             Scanner scan = new Scanner(System.in);
             System.out.println("Enter the department id: ");
             int depa_id = scan.nextInt();
             
             rs = stmt.executeQuery("select min(salary), max(salary), avg(salary), sum(salary) from employees where department_id ="+depa_id);
//             rs.beforeFirst();
            while(rs.next())
             {
                 System.out.println("Minimum Salary : "+rs.getFloat(1));
                 System.out.println("Maximum Salary : "+rs.getFloat(2));
                 System.out.println("Average Salary : "+rs.getFloat(3));
                 System.out.println("Sum of Salary : "+rs.getFloat("sum(salary)"));
                 
             }
             
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException se) {
                System.out.println(se.getMessage());
            }
        }
    }
}

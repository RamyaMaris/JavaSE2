
package com.ntuc.demos.JDBC.statementmethods;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ExecuteQueryMethod {
    static ResultSet rs;
    
    public static void main(String[] args) {
        Connection conn = UseMySql.useDb("employees");
        try {
            Statement stmt = conn.createStatement();
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

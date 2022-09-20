
package com.ntuc.demos.JDBC.statementmethods;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteMethod {
    static boolean status;

    public static void main(String args[]) {
        Connection conn = UseMySql.useDb("employees");
        try {
            Statement stmt = conn.createStatement();

            /* 
            execute method 
            1. Used to execute any SQL statement
            2. true if the result is a ResultSet object; 
               false if it is an update count or there are no results;
            4. throws SQL exception
            5. Used with all sql statements
             */
            status = stmt.execute("insert into employees values"
                    + "(219,'george','bush','gb@ms.com',945852622,'1954-03-16',8,5000,101,4)");
            System.out.println(" boolean return value for a insert statement is --" + " " +status);
            status = stmt.execute("Select * from departments where department_id = 100");
            System.out.println(" boolean return value for a select statement is --" + " " +status);
            
        } catch (SQLException se) {

            System.out.println(se.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException se1) {
                System.out.println(se1.getMessage());
            }
        }
    }
}


package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTableData {
    public static void main(String[] args) {
        Connection conn = UseMySql.useDb("employees");
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("delete from employees where employee_id = 210");
            
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


package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableData {
    public static void main(String[] args) {
        Connection conn = UseMySql.useDb("employees");
        try {
            Statement stmt = conn.createStatement();
            int i = stmt.executeUpdate("insert into employees values"
            + "(300,'bill','gates','bgs@ms.com',555555,'1987-10-10',8,5000,101,4)");
            System.out.println(i);
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

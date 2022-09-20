package com.ntuc.demos.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample {

    static ResultSet rs;
    static Statement stmt;
    static Connection conn = UseMySql.useDb("employees");

    public static void main(String[] args) throws SQLException {
    ResultSetExample ex = new ResultSetExample();
        stmt = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_UPDATABLE);
    ex.getValue();
    }

   
    void getValue() {
        try {
//            System.out.println(stmt.execute("select * from employees"));
            rs = stmt.executeQuery("select * from employees");
            rs.first();
            System.out.println(rs.findColumn("last_name"));
            if(rs.next())
            {
                getValue();
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                rs.close();
                conn.close();
            } catch (SQLException se) {
                System.out.println(se.getMessage());
            }
        }

    }
}


package com.ntuc.demos.preparedstatement;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementInsert {
    public static void main(String[] args) {
        Connection conn = UseMySql.useDb("employees");
        try {
            PreparedStatement ps = conn.prepareStatement("insert into locations (location_id, street_address, postal_code, city, state_province,country_id) values(?,?,?,?,?,?)");
            ps.setInt(1, 2601);
            ps.setString(2, "425C Fernvale, #03-45");
            ps.setString(3, "234982");
            ps.setString(4, "Senkang");
            ps.setString(5, "Singapore");
            ps.setString(6, "sg");
            int rows = ps.executeUpdate();
            System.out.println(rows +" rows updated.");
            UseMySql.logFilePrepared("Data inserted into locations table.");
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


package com.ntuc.demos.preparedstatement;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementUpdate {
    public static void main(String[] args) {
        Connection conn = UseMySql.useDb("employees");
        try {
            PreparedStatement ps = conn.prepareStatement("update employees set first_name=? where employee_id=?");
            ps.setString(1, "bailey");
            ps.setInt(2, 110);
            int rows = ps.executeUpdate();
            System.out.println(rows +" rows updated.");
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

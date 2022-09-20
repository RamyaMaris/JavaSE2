
package com.ntuc.demos.preparedstatement;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDelete {
    public static void main(String[] args) {
        Connection conn = UseMySql.useDb("employees");
        try {
            PreparedStatement ps = conn.prepareStatement("delete from employees where employee_id = ?");
            ps.setInt(1, 219);
            int rows = ps.executeUpdate();
            System.out.println(rows +" rows deleted.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally{
            try {
                conn.close();
            } catch (SQLException se) {
                System.out.println(se.getMessage());
            }
        }
    }
}

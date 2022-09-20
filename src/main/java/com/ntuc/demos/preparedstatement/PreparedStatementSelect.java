
package com.ntuc.demos.preparedstatement;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementSelect {
    public static void main(String[] args) {
        Connection conn = UseMySql.useDb("employees");
        try {
            PreparedStatement ps = conn.prepareStatement("select last_name, salary from employees where salary>? and salary<?");
            ps.setInt(1, 3000);
            ps.setInt(2, 8000);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString("last_name")+" --- "+rs.getDouble("salary"));
                
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

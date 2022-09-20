
package com.ntuc.demos.preparedstatement;

import com.ntuc.demos.JDBC.UseMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementCreate {
    public static void main(String[] args) {
        Connection conn = UseMySql.useDb("employees");
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("create table sample(id int, name varchar(100), grade int)");
            int rows = ps.executeUpdate();
            System.out.println("table create->"+rows + "row(s) affected.");
//            ps = conn.prepareStatement("drop table sample");
//            int row1 = ps.executeUpdate();
//            System.out.println("delete table->"+row1 + "row(s) affected.");
            
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

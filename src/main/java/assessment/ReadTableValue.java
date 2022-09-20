package assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadTableValue {

    static Connection conn = null;
    static ResultSet rs;

    public static void main(String[] args) {
        conn = ReadTableValue.connDb("employees");
//        First_Name    Last_Name   Salary    Department_Name
        Statement stmt;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select first_name,last_name,salary,department_name from employees e, departments d where e.department_id = d.department_id");
            System.out.printf("%-15s%-15s%-15s%-15s\n", "First_Name","Last_Name","Salary","Department_Name");
            System.out.println("________________________________________________________________________________");
            while (rs.next()) {
                System.out.printf("%-15s%-15s%-15s%-15s\n",rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getString(4));
//                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3)+"\t"+rs.getString(4));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                conn.close();
            } catch (SQLException se1) {
                System.out.println(se1.getMessage());
            }
        }

    }

    public static Connection connDb(String str) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException cne) {
            System.out.println("MySQL driver not found" + cne.getMessage());
            return null;
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + str, "root", "root");
//System.out.println("MySQL Connection established");
            return conn;
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
        return null;
    }
}

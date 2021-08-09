package com.hugo95.hugoboard;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
import org.junit.Test;

public class MySQLConnectionTest {
  
  static final String DRIVER = "com.mysql.cj.jdbc.Driver";
  static final String URL = "jdbc:mysql://127.0.0.1:3306/hugo_board?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
  static final String USERNAME = "board";
  static final String PASSWORD = "mysql_p@ssw0rd";
  
  @Test
  public void testConnection() {
    Connection conn = null;
    Statement stmt = null;
    
    try {
        
        System.out.println("=====> MySQL Connection begin");
        
        Class.forName(DRIVER);
        
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        stmt = conn.createStatement();

        String sql = "SELECT * FROM tbl_board";

        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            
            String title = rs.getString("title");
            String content = rs.getString("content");
            String reg_id = rs.getString("reg_id");

            System.out.print("title : " + title + ", ");
            System.out.print("content: " + content + ", ");
            System.out.println("reg_id: " + reg_id);
        }

        rs.close();
        stmt.close();
        conn.close();

    } catch (SQLException se1) {
        se1.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
    
    System.out.println("=====> MySQL Connection end");
  }

}

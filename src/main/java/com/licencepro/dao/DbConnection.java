package com.licencepro.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
        public static void main(String args[]) {
            try {
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "");
                System.out.print("Database is connected !");
                conn.close();
            }
            catch(Exception e) {
                System.out.print("Do not connect to DB - Error:"+e);
            }
        }
}

package com.rono.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "1conl1v1ng";
		try {
			System.out.println("connecting to db");
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("connection successful");
		} 
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}

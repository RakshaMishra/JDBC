package com.kodnest.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Updatedata{
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost/kodnest1";
			String username="root";
			String password="qwerty";
			Connection connection = DriverManager.getConnection(url, username, password);
		    Statement st= connection.createStatement();
		
		
			
			String str="update student set name='anish' where id=45";
			int executeUpdate=st.executeUpdate(str);
			System.out.println("success "+executeUpdate);
		}

	}



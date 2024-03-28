package com.kodnest.jdbc;


	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
	import java.sql.Statement;

	public class Display{
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost/kodnest1";
			String username="root";
			String password="qwerty";
			Connection connection = DriverManager.getConnection(url, username, password);
		    Statement st= connection.createStatement();
		
		
			
			String str="select * from student";
			ResultSet rs=st.executeQuery(str);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}

	}





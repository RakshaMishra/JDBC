package com.kodnest.jdbc;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Bankinsert{
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost/kodnest1";
			String username="root";
			String password="qwerty";
			String str1="update bank set balance=balance-5000 where acc_no=99";
			String str2="update bank set balance=balance+5000 where acc_no=94";
			Connection connection=null;
			try {
		 connection = DriverManager.getConnection(url, username, password);
			connection.setAutoCommit(false);
		    Statement st= connection.createStatement();
			st.addBatch(str1);
			st.addBatch(str2);
			
			st.executeBatch();
			connection.commit();
			}
			catch(Exception e)
			{  System.out.println("exception occured");
				connection.rollback();
				
			}
		
			
			
		
		
					
					
					
			
					
//			st.execute(str1);
//			st.execute(str2);
//			st.execute(str3);
//			st.execute(str4);
			
			System.out.println("success");
		}

	}




//Connect jar(manager) with DBMS(Driver) System
// import java.sql.DriverManager;
//import java.sql.Connection;

import java.sql.*;

class Demo{
	public static void main(String[]args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data", "root", "root");
			System.out.println("Connection successful");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
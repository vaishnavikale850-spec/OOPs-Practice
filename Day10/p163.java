/*	class = Class 
	method = forName
	parameter = Driver path
*/

import java.sql.*;

class Demo{
	public static void main(String[]args)throws Exception {
		//Driver loading = java & jar
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load successfully !!!");

		//Connection Built = jar & dbms
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		System.out.println("Connection successfully !!!");

		
		// create query/ statement
		PreparedStatement ps = con.prepareStatement("insert into student_info values('Abhi','12@erty')");

		//Execution of query
		int i = ps.executeUpdate();
		
		//display

		if(i>0){
			System.out.println("Query executed successfully!!!");
		}
		else{
			System.out.println("Query execution failed !!!");
		}

		con.close();

		
	}
}
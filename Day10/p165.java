import java.sql.*;

class Demo{
	public static void main(String[]args){
		//Driver loading = java & jar
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load successfully !!!");

		//Connection Built = jar & dbms
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","roo");
		System.out.println("Connection successfully !!!");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
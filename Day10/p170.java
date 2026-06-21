import java.sql.*;

class Demo{
	public static void main(String[]args){
		//Driver loading = java & jar
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver load successfully !!!");

		//Connection Built = jar & dbms
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		System.out.println("Connection successfully !!!");

		//Statement = interface & createStatement() = method
		Statement smt = con.createStatement();

		String q = "delete from student_info";
		smt.executeUpdate(q);
		System.out.println("Deleted successfully !!!");
				
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
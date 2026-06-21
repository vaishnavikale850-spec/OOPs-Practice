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

		String q = "select * from student_info";

		ResultSet rs = smt.executeQuery(q);
		while(rs.next()){
			System.out.println(rs.getString("name") +  " : " + rs.getString("password"));	
		}
		
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
class Demo{
	public static void main(String[]args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(10/0);
			System.out.println("Hello");
		}
		catch(Exception e){
			//print what's wrong in code
			System.out.println(e.getMessage());
		}
	}
}
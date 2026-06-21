//Connect jar with java file(API)
class Demo{
	public static void main(String[]args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Hello");
	}
}
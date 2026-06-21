class Demo{
	public static void main(String[]args){
		Codex.fun();
	}
}
class Codex{
	public static final int a = 10;

	public static final void fun(){
		static int b = 20; // error global scope accessible for entire class 
		System.out.println("in fun " +a);
	}
	
	
}

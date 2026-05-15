/*
static block > static variable > main method > object create> non - static variable(instance var) > instance block > constructor > non - static method > static method
*/

class Demo{
	public static void main(String[]args){
		Demo d = new Demo();
		System.out.println("in main");
		d.funs();
		d.fun();
	}
	static {
		System.out.println("in static block1");
	}
	{
		System.out.println("in non static block");
	}
	Demo(){
		System.out.println("in constructor");
	}
	static void funs(){
		System.out.println("in static fun");
	}
	void fun(){
		System.out.println("in non static method");
	}
}

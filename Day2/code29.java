/*
Static variable = For a static variable there is always a static block is created in method area and it execute before execution of main method.

Note : 
1. Static variable + static method = Yes allowed
2. Static variable + insatnce method(non -static method )= Yes allowed
3. Instance variable + static method = Not allowed
4. Instance variable + instance method = Yes allowed
*/

class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		c.fun();
		System.out.println(c.a);
		Codex.funs();
		System.out.println(Codex.a);
	}
}

class Codex{
	static int a = 22;
	
	void fun(){
		System.out.println("in fun "+ a);
	}
		
	static void  funs(){
		System.out.println("in funs "+ a);
	}

}
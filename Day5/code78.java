/*1. Compile time polymorphism : method overloading  : Same method name but different parameters

Error detected at compile time by complier.
2. Run time polymorphism : method overriding  : Method is already implemented  in parent but still child implement it. 
Error detected at run time by JVM.
*/
class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		c.fun(20, 30);
		c.fun(10);
	}
}

class Codex{
	void fun(int b, int c){
		System.out.println("in fun");
	}	
	//Allow fun method because having different parameter. 
	void fun(int a){
		System.out.println("in fun " + a);
	}	
}
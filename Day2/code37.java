/*
Reinitialization of instance variable = by constructor and by object creation.
*/

/* 1. By using object 
class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		c.fun();
		c.a = 15;
		c.fun();
	}
}
 
class Codex{
	int a = 22;
	
	void fun(){
		System.out.println("in non - static method : "+ a);

	}	
}

2. By using constructor
*/

class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		System.out.println(c);
		c.fun();
		Codex c1 = new Codex(16);
		System.out.println(c1);
		c1.fun();
		c.fun();
	}
}
 
class Codex{
	int a = 22;
	Codex(){
		
	}

	Codex(int a){
		this.a = a;
	}

	void fun(){
		System.out.println("in non - static method : "+ a);

	}	
}

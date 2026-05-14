/*
Methods :
1. Insatnce method = Non - static method
2.Static method
*/

class Demo{
	public static void main(String [] args){
		//Codex.print(); = non-static context can't be referenced from a static context.

		Codex c = new Codex();
		c.print();
	}
}

class Codex{
	void print(){
		System.out.println("in instance method.");
	}
}
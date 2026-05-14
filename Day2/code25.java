/*
Methods :
Instance variable can directly accessed in instance method
but not in static method.
*/

class Demo{
	public static void main(String [] args){
		Codex c = new Codex();
		c.print(c);
		//Codex.print(c);	
	}
}

class Codex{
	int a = 22;
	static void print(Codex c1){
		System.out.println("in instance method : " + c1.a);
	}
}
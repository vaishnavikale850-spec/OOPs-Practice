/*
Methods :
Instance variable can directly accessed in instance method
but not in static method.
*/

class Demo{
	public static void main(String [] args){
		//Codex.print(); = non-static context can't be referenced from a static context.

		Codex c = new Codex();
		c.print();
		//c.printa(); = not allowed
	}
}

class Codex{
	int a = 22;
	void print(){
		System.out.println("in instance method : " + a);
	}
	static void printa(){
		System.out.println("in instance method : " + a);
	}

}
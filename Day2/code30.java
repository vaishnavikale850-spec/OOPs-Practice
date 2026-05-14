/*
When a change occur in static variable , it can be reflect for all objects(instances).
*/

class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		c.a++;
		c.fun(); //23
		Codex c1 = new Codex();
		c1.fun(); //23 because of only one static block.
	}
}

class Codex{
	static int a = 22;
	
	void fun(){
		System.out.println("in fun "+ a);
	}
}
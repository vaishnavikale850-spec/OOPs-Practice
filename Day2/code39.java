/*
a = a means changing the value of local variable.
*/
class Demo{
	public static void main(String[]args){
		Codex c = new Codex(20);
		c.fun();		
		Codex c1 = new Codex(30);
		c1.fun();
	}
}

class Codex{
	int a ;
	Codex (int a){
		a = a; // Local variable
		System.out.println(a);
	}
	void fun(){
		System.out.println("local var "+ a + "instance var " + this.a);
	}
}
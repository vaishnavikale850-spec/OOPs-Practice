/*
this : refer to current address.
Static method need to pass object as a parameter because it doesn't have it's address.
Non - static method does not need to pass object as a parameter because it's address is passes automatically in a java keyword this.
When object is passed as a parameter there should be class is present as a datatype.

*/

class Demo{
	public static void main(String [] args){
		Codex c = new Codex();
		c.print(c);
		//Codex.print(c);	
		c.printa();
	}
}

class Codex{
	int a = 22;
	static void print(Codex c1){
		System.out.println("in instance method : " + c1.a);
	}

	void printa(){
		System.out.println("in instance method : " + this.a);
	}
}
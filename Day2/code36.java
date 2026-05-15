/*
this keyword : "this" is the keyword in java which refer the current address of class.
Non - static method can automatically call "this"(object) where we won't need to pass the address to access the instance variable of that class.
Static method needs to pass the address, in static method this can't be pass automatically, where we need to pass the object as a parameter and then able to access instance variables.
*/

class Demo{
	public static void main(String[]args){
		System.out.println("in main");
		Codex c = new Codex();
		c.fun();
		Codex.funs(c);
		
	}
}

class Codex{
	int a = 22;
	
	void fun(){
		//System.out.println("in non static method "+ a );
		//System.out.println("in non static method "+ this.a );
		System.out.println("in this : "+ this );

	}

	static void funs(Codex c1){
		//System.out.println("in static method "+ this.a); error
		System.out.println("in static method "+ c1.a);
		System.out.println("in c1 :"+ c1); // both c1 and this have same addresses.

	}
	
}
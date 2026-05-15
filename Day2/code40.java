/*
this keyword is also used for calling current address constructor and is written as this()

this. = current address (current object)of class
this() = function/method calling consructor of that class depends on parameter passing.

*/

class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		//Codex c1 = new Codex(10);
	}
}

class Codex{
	Codex(){
		this(10);
		System.out.println("in non - para constructor");
	}
		
	Codex(int a){
		// this(); error: recursive constructor invocation
		System.out.println("in para constructor");
	}
}
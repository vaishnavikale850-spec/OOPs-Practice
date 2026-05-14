/*
Class & Object

Compile = Yes
Runtime Error = main method not found
*/

class Demo{
	public static void main(String[]args){
		//Codex.print(); call by class name not allowed here way to call static method
		Codex c = new Codex(); //Object created in heap and reference is stored in c object which contains address of Codex class.
		c.print();
	}
}
class Codex{
	int a = 10;	
	void print(){	
		System.out.print("in print "+ a);
	}
}
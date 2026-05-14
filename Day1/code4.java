/*
Instance variable :
int = 0;
float = 0.0
char = " "
String = null
boolean = false

Local var always should be declared.
*/
class Demo{
	public static void main(String[]args){
		Codex.print();
	}
}
class Codex{
	int a = 10;	
	static void print(){	
		System.out.print("in print "+ a);
	}
}
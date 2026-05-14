/*
Reinitializing instance variables
1. By creating object and accessing values to properties for a class.
2. Instance var can get memory allocation after object creation.
3. Codex is the class and num and name are the properties which are accessible in Codex class.
*/

class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		System.out.println(c.num);
		c.display();
		c.num = 10;
		c.name = "Radha";	
		c.display();
	}
}

class Codex{
	int num;
	String name;
	
	void display(){
		System.out.println("Num is " + num);
		System.out.println("Name is " + name);
	}
}
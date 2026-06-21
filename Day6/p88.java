/* Overriding & upcasting
upcasting = When child object and parent reference is created compiler bind that method (the reference) and execute it first & then go to another method
*/
class Demo{
	public static void main(String[]args){
		Parent p = new Parent();
		p.printData();
		
		//overriding
		Child c = new Child();
		c.printData();
		
		//upcasting
		Parent p = new Child();
		p.printData();
	}
}

class Parent{
	void printData(){
		System.out.println("in Para");
	}
}

class Child extends Parent{
	void printData(){
		System.out.println("in Child");
	}
}
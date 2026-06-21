class Demo{
	public static void main(String[]args){
		Parent p1 = new Parent();
		p1.printData();
		
		//overriding
		Child c = new Child();
		c.printData();
		
		//upcasting
		Parent p = new Child();
		p.printData();
	}
}

class Parent{
	static void printData(){
		System.out.println("in Para");
		return ;
	}
}

class Child extends Parent{
	static void printData(){
		System.out.println("in Child");
	}
}
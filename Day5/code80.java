//2. Run Time Polymorphism  : Method Overriding

class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.property();
	}
}

class Parent{	
	void property(){
		System.out.println("in property parent 100");
	}	
}

class Child extends Parent{

	void property(){
		System.out.println("in property child 200");
	}	


}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.shopping();
		c.education();
	}
}

abstract class Parent{
	abstract void education();
	void shopping(){
		System.out.println("shopping");
	}
}

class Child extends Parent{
	void education(){
		System.out.println("in child");
	}
}
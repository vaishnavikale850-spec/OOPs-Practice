class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.education();
	}
}

abstract class Parent{
	abstract void education();
}

class Child extends Parent{
	void education(){
		System.out.println("in child");
	}
}
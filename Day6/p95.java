class Demo{
	public static void main(String[]args){
		Parent p = new Parent(); // not allowed
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
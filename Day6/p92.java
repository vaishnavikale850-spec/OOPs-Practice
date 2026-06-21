/*
Abstract class = when all implementation is depends on child not on parent then we use abstract class. In which only execution is defined do not have any implementation written.
- We use abstract keyword
-Abstract class can have constructor  (sequencial calling happen)
- Can't possible to create instance(obj).
- Can have normal + abstract methods

*/

class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.education();
	}
}

abstract class Parent{
	abstract void education(){}; //error
}

class Child extends Parent{
	void education(){
		System.out.println("in child");
	}
}
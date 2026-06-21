// default child static interface not allowed vice versa not allowed
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.f();
		//Child.f();
		//A.f();
	}
}
interface A{
	void f(){ 
		System.out.println("in A");
	}
}

class Child implements A{ 
	public void f(){ //not allowed in inside class only for interface
		System.out.println("in Child");
	}
}
// interface static child non - static ----> allowed , vice versa not allowed
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.f();
		//Child.f();
	}
}
interface A{
	static void f(){ 
		System.out.println("in A");
	}
}

class Child implements A{ 
	void f(){ 
		System.out.println("in Child");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.f();
	}
}
class A{
	int a = 10;
}

class B{
	int a = 20;
}

class Child extends A,B{ //" { " expected 
	void f(){
		System.out.println(a);
	}
}
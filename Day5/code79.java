/*
Overriding = same method name, same parameter, same return type
*/

class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.fun(10);

		Parent p = new Parent();
		p.fun(19);

		Parent p1 = new Child(); // extends parent & restrict to use parent body.
		p1.fun(12);
	}
}

class Parent{	
	void fun(int a){
		System.out.println("in fun para " + a);
	}	
}

class Child extends Parent{

	void fun(int a){
		System.out.println("in child fun " + a);
	}	


}
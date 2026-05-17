/*
this = represent the current object 
super. = it can access memners of parent class
super() = it can call the parent constructor
child and parent class have different addresses.
If extends is used then automatically parent constructor is called and then child constructor is called. 
*/

class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.f();

	}
}

class Parent{
	int money = 1000;
}

class Child extends Parent{
	int money = 100;
	void f(){
		System.out.println(this);
		System.out.println(super); // error : reserved keyword <identifier>needed
		System.out.println(super.money);
	}	
}	
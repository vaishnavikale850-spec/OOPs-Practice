class Demo{
	public static void main(String[]args){
		Parent p = new Parent();
		p.p();
		Child c = new Child();
		c.f();
	}
}

class Parent{
	int money = 1000;
	void p(){
		System.out.println(this.money);
	}
}

class Child extends Parent{
	int money = 100;
	void f(){
		System.out.println(this.money);
	}	
}	
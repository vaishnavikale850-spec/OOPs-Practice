//Composition = object of 1 class created inside diff class method

class Demo{
	public static void main(String [] args){

	Child c = new Child();
	c.childuses();
		
	}
}

class Parent{
	int money = 100;
}

class Child extends Parent{
	Parent p = new Parent();
	void childuses(){
		System.out.println("Education fees : " + p.money);
	}
}
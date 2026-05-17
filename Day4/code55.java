class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.property();
		c.education();
		c.shopping();
	}
}

class Parent{
	int money = 1000;
	void property(){
		System.out.println("Property : " + money + " and land : 2arcs");
	}
}

class Child extends Parent{

	void education(){
		System.out.println("Education : " + money);
	}

	void shopping(){
		System.out.println("Shopping : " + money );
	}

}
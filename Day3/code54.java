class Demo{
	public static void main(String [] args){
	Child c = new Child();
	c.education();
	c.shopping();
	}
}

class Parent{
	int money = 100;
}

class Child extends Parent{
	void education(){
		System.out.println("Education fees : " + money);
	}

	void shopping(){
		System.out.println("Shopping : " + money);
	}

}
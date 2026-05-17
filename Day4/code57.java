class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.education();

	}
}

class Parent{
	int paise = 100;	
}

class Child extends Parent{
	void education(){
		System.out.println("in Child");
	}

}
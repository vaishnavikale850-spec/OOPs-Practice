class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.education();

	}
}

class Parent{
	int paise = 100;	
	void education(){
		System.out.println("in Child");
	}
}

class Child extends Parent{

}
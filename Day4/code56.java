/*
In parent and child class, method having same name is allowed. If child class do not haing any method then it uses parent method.  
*/

class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.education();
		Parent p = new Parent();
		p.education();

	}
}

class Parent{
	int paise = 100;
	void education(){
		System.out.println("in Parent");
	}
}

class Child extends Parent{
	void education(){
		System.out.println("in Child");
	}

}
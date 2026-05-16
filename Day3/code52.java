/*
Inheritance : 
- To solve the complex structure of code, passing object or creating object of one class in defferent class there is inheritance is used.
- Inheritance is derived class extend base class properties , method as same as in our houses parent property is automatically accessed by children.
- This relation between two classes are established using keyword "extends".
- It is alse known as "is a relation".
  

*/

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
	void childuses(){
		System.out.println("Education fees : " + money);
	}
}
/*
Access Modifier / Access Specifiers
1. public = access in same file and different folder  ----------------->  public int a = 10; 
2. default = access in same file not in different folder -------------> int a = 10;
3. protected = access in same file and not in different folder -------------> protected a = 10;
4. private  = not access in same file and different folder --> private a = 10;
*/

class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.fun();
	}
}

class Parent{
	public void fun(){
		System.out.println("in fun");
	}
}

class Child extends Parent{
	void fun(){
		System.out.println("in fun");
	}
}
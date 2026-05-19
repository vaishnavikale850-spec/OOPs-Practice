class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.fun(10);
	}
}

class Parent{	
	void fun(int a){
		System.out.println("in fun " + a);
	}	
}

class Child {

	void fun(int a){
		System.out.println("in child fun " + a);
	}	


}
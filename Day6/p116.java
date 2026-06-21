//error
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.f(); 	
	}
}
interface A{
	default void f(){
		System.out.println("in A");
	}
}

interface B{
	 default void f(){
		System.out.println("in B");
	}
}


class Child implements A,B{ 
	
}
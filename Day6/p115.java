/*error : types A and B are incompatible; class Child inherits unrelated defaults 
1 error
*/
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.f();
		c.g(); 	
	}
}
interface A{
	default void f(){
		System.out.println("in A");
	}
}

interface B{
	 default void g(){
		System.out.println("in B");
	}
}


class Child implements A,B{ 
	
}
//If child do not implement interface then that method is not visible or accessible in child class.
class Demo{
	public static void main(String[]args){
		//error
		//Child c = new Child();
		//c.f();
		//A.f();
	}
}
interface A{
	static void f(){ 
		System.out.println("in A");
	}
}

class Child implements A{ 
	
}
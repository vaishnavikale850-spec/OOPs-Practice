class Demo{
	public static void main(String[]args){
		//Child c = new Child();
		//c.f(); error
		A.f();	
	}
}
interface A{
	 static void f(){
		System.out.println("in A");
	}
}

class Child implements A{ 
	
}
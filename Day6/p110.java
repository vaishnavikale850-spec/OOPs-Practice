// protected child static interface allowed vice versa not allowed
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.f();
		//Child.f();
		// error protected A.f();
	}
}
interface A{
	 private void f(){
		System.out.println("in A");
	}
}

class Child implements A{ 
	void f(){ 
		System.out.println("in Child");
	}
}
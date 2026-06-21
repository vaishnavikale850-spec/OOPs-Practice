//Java 8 onward , we can write body in interface still it is abstract
class Demo{
	public static void main(String[]args){
		Child c = new Child();
	}
}
interface A{
	private void f(){ // child can't access f() can't find symbol
		System.out.println("in A");
	}
}

class Child implements A{ 

}
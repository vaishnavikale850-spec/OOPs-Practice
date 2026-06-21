/*If child do not implement interface then that method is not visible or accessible in child class.

Interface method type        Body allowed       Inherited by child        can override
1. abstract/public                      NO				Yes				Yes
2. default					 Yes				Yes				Yes
3. static 					 Yes				NO			   	NO
4. private					 Yes				NO				NO
5. protected				 NO				NO			   	NO


*/
class Demo{
	public static void main(String[]args){
		Child.f();
		//A.f(); error
	
	}
}
interface A{
	private void f(){ 
		System.out.println("in A");
	}
}

class Child implements A{ 
	static void f(){ //implement or call it not interface A  
		System.out.println("in Child");
	}
}
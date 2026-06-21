//Parameter also known as signature.

class Demo{
	public static void main(String[]args){
		Parent p = new Child(10);
	}
}

class Parent{	
	Parent(){
		System.out.println("in para fun ");
	}	
}

class Child extends Parent {

	Child(int a){
		System.out.println("in child fun ");
		super(); //flexible constructors
	}	 
}
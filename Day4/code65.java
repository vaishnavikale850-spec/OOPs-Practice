class Demo{
	public static void main(String[]args){
		Child c= new Child();
	
	}
}

class Parent{
	// Error : constructor Child in class Child cannot be applied to given types;
	Parent(int a){
		System.out.println("in Para Constructor");
	}
	
}

class Child extends Parent{
	Child(){
		System.out.println("in Child Constructor");
	}
}	
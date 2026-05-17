class Demo{
	public static void main(String[]args){
		Parent p= new Parent(10);
		Child c= new Child();
	
	}
}

class Parent{
	Parent(int a){
		System.out.println("in Para Constructor");
	}
	
}

class Child extends Parent{
	Child(){
		super(10);
		System.out.println("in Child Constructor");
	}
}	
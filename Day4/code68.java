class Demo{
	public static void main(String[]args){
		Parent p= new Parent(20);
		Child c= new Child();
	
	}
}

class Parent{
	int a;
	Parent(int a){
		this.a = a;
		System.out.println("in Para Constructor : " + a);
	}
	
}

class Child extends Parent{
	Child(){
		super(10);
		System.out.println("in Child Constructor");
	}
}	
/*
super() this method get automatically called and if we will not write it still it get call.

*/

class Demo{
	public static void main(String[]args){
		//Parent p = new Parent();
		Child c = new Child();

	}
}

class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent{
	Child(){
		super();
		System.out.println("Child Constructor");
	}
}
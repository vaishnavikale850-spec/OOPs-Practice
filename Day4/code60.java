/*
When child object is created then 1st parent constructor get called after that child constructor get call.
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
		System.out.println("Child Constructor");
	}
}
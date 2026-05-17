/*
super() without extends will not giving error, it get check that parent (base class) is present or not, if it's not present it executed child constructor. 
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

class Child{
	Child(){
		super();
		System.out.println("Child Constructor");
	}
}	
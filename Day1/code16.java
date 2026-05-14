class Demo{
	public static void main(String[]args){
		System.out.println("---Data of obj1 ---");
		Empolyee e1 = new Empolyee();
		System.out.println(e1);
		System.out.println(e1.a);
		e1.display();
		System.out.println("---Data of obj2--- ");
		Empolyee e2 = new Empolyee();
		System.out.println(e2);
		System.out.println(e2.a);
		e2.display();
	}
}

class Empolyee{
	int a ; 
	Empolyee(){
		a = 10;
	}

	void display(){
		System.out.println("Data is "+ a);
	}

}
class Demo{
	public static void main(String[]args){
		Empolyee e1 = new Empolyee();
		Empolyee e2 = new Empolyee();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.a);
		System.out.println(e2.a);
	}
}

class Empolyee{
	int a ; 
	Empolyee(){
		a = 10;
	}

}
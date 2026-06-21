class Demo{
	public static void main(String[]args){
		Num1 n = new Num1();
		n.printNum();
	}
}

interface Num1{
	// public static final int a;
	int a = 10;
}

interface Num2{
	int b = 20;
}
class Num implements Num1, Num2{
	void printNum(){
		System.out.print(a);
	
	};
}


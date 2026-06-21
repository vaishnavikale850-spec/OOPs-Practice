// reference to a is ambiguous
class Demo{
	public static void main(String[]args){
		Num n = new Num();
		n.printNum();
	}
}

interface Num1{
	int a = 10;
}

interface Num2{
	int a = 20;
}
class Num implements Num1, Num2{
	void printNum(){
		System.out.println(Num1.a);
		System.out.println(Num2.a);
	}
}


// reference to a is ambiguous for after Java 8 Num1 variable get call
class Demo{
	public static void main(String[]args){
		Num1 n = new Num1(); // error can't create instance of a interface
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
		System.out.print(a);
	
	}
}


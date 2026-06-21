class Demo{
	public static void main(String[]args){
		Num n = new Num();
		n.printNum();
	}
}

interface Num1{
	int a = 10;
}

class Num implements Num1{
	void printNum(){
		a = 30; // variable is final, can't assign a value
		System.out.print(a);
	}
}


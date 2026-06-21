class Demo{
	public static void main(String[]args){
		Num n = new Num();
		n.printNum();
	}
}

interface Num1{
	int a = 10;
	void printNum();
}

class Num implements Num1{
	public void printNum(){
		System.out.print(a);
	}
}


//Error : non-static variable a cannot be referenced from a static context
                System.out.print("in print "+ a);

class Demo{
	public static void main(String[]args){
		Codex.print();
	}
}
class Codex{
	int a = 10;	
	static void print(){	
		System.out.print("in print "+ a);
	}
}
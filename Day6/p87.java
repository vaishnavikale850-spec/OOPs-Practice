//Method Overloading
class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		System.out.println(c.add(10,20));
		System.out.println(c.add(20,30,40));
	}
}

class Codex{
	int add(int a , int b){
		return a + b;
	}

	int add(int a , int b, int c){
		return a + b + c;
	}
}
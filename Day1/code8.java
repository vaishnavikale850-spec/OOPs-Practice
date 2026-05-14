class Demo{
	public static void main(String[]args){
		System.out.println("Num is " + new Codex().num);// new memory allocation 1

		new Codex().num = 10; // new memory allocation 2

		System.out.println("Num is " + new Codex().num); // new memory allocation 3

	}
}

class Codex{
	int num;
}
/*
Private constructor can't get call directly.
To access non - static method in another class, 
1. To create obj
2. To write static getter method which return object.
*/
class Demo{
	public static void main(String[]args){
		//error: Codex() has private access in Codex
		//Codex c = new Codex();
		Codex.getAdd().fun();
		Codex c1 = Codex.getAdd();
		c1.fun();
	}
}

class Codex{
	private Codex(){}
	void fun(){
		System.out.println("in fun");
	}

	static Codex getAdd(){
		return new Codex();
	}
	
}
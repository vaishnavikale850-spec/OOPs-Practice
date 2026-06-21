//Null pointer exception
class Demo{
	public static void main(String[]args){
		Codex c = null;
		c.fun();
	}
}

class Codex{
	void fun(){
		System.out.println("in fun");
	}
}

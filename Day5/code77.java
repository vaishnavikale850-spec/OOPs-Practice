class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		c.fun();
		c.fun(10);
	}
}

class Codex{

	void fun(){
		System.out.println("in fun");
	}	
	//Allow fun method because having different parameter. 
	void fun(int a){
		System.out.println("in fun " + a);
	}	
}
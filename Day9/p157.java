class Demo{
	public static void main(String[]args){		
		//error : Codex is abstract; cannot be instantiated
		//Codex c = new Codex();
		//c.fun();
	
		//static method in interface can created using interface name and . memeber that you want to access.
		// 
		Codex.fun();
	}
}

interface Codex{
	static void fun(){
		System.out.println("in fun");
	}
}
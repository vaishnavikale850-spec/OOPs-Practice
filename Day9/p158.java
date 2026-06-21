class Demo{
	public static void main(String[]args){		
		//error : Codex is abstract; cannot be instantiated
		//Codex c = new Codex();
		//c.fun();
	
		//static method in interface can created using interface name and . memeber that you want to access.
		// static method can't be inherit because it's belongs to class not reference obj.
		Codex.fun();
	}static void fun(){
		System.out.println("in fun");
	}
}

interface Codex{
	
}
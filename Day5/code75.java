//Constructor Chaining

class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
	}
}

class Codex{
	int x;
		
	Codex(int x){
		// this(); recursive constructor invocation
		this.x = x;
		System.out.println("Para constructor " + x);
	}
	
	Codex(){
		this(20);
		System.out.println("non - para constructor");
	}
}
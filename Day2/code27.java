class Demo{
	public static void main(String [] args){
		Codex c = new Codex();
		c.printa();
		Codex.print(c);
		c.printa();	
	}
}

class Codex{
	int a = 22;
	static void print(Codex c1){
		System.out.println("in instance method : " + c1.a);
	}

	void printa(){
		System.out.println("in instance method : " + this.a);
		this.a = 50;
	}
}
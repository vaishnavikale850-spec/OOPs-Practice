class Demo{
	public static void main(String[]args){
		Codex c = new Codex(200);
		System.out.println(c.a);	
		//error
		c.a = 300;
		System.out.println(c.a);	
		
	}
}
class Codex{
	final int a ;
	Codex(int a){
		this.a = a;
	}
}

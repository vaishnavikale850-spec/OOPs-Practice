class Demo{
	public static void main(String[]args){
		Codex c = new Codex(200);
		System.out.println(c.a);	
		Codex c1 = new Codex(300);
		System.out.println(c1.a);
	}
}
class Codex{
	final int a ;
	Codex(int a){
		this.a = a;
	}
}

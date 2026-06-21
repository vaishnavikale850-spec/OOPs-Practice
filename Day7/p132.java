class Demo{
	public static void main(String[]args){
		Codex c = new Codex(200);
		System.out.println(c.a);
	}
}
class Codex{
	final int a = 10;
	Codex(int a){
		this.a = a;
	}
}

class Demo{
	public static void main(String[]args){
		Codex c = new Codex(200);
		System.out.println(c.a);
	}
}
class Codex{
	// error: cannot assign a value to final variable a
	final int a = 10;
	Codex(int a){
		this.a = a;
	}
}

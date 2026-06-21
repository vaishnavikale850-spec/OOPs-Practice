// error: a has private access in Codex
class Demo{
	public static void main(String[]args){
		System.out.println(new Codex().a);
	}
}

class Codex{
	private int a = 10;
}
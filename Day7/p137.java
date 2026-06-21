class Demo{
	public static void main(String[]args){
		System.out.println(Codex.a);
		Codex.a = 100;
		System.out.println(Codex.a);
	}
}
class Codex{
	static int a = 10;
	static int b = 20;
	
}

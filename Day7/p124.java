class Demo{
	public static void main(String[]args){
		new Codex().getFun();
	}
}

class Codex{
	private int a = 10;
	
	void fun(){
		System.out.print("in fun "+a);
	}
}
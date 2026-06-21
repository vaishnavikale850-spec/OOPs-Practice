class Demo{
	public static void main(String[]args){
		System.out.println( new Codex().getFun());
	}
}

class Codex{
	private int a = 10;
	
	int getFun(){
		return a;
	}
}
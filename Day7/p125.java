/*
With setter method using on referance variable updated here but with object, every time new object is created so value of a not updated.
*/

class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		System.out.println(new Codex().getFun());
		new Codex().setFun(20);
		System.out.println(new Codex().getFun());
		c.setFun(20);
		System.out.println(c.getFun());
		
	}
}

class Codex{
	private int a = 10;
	
	void setFun(int a){
		this.a = a;
	}
	int getFun(){
		return a;
	}
}
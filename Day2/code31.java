/*
Instance variable = entire class different because of different instances(object). Call by Referance
Static variable = entire class single if any of object changes that static variable it also reflect on another objects because it is changed permanantly. Call by Values.
*/

class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		c.fun();
		c.a++;
		c.b++;
		Codex c1 = new Codex();
		c.fun();
		c1.fun(); //23 because of only one static block.
	}
}

class Codex{
	static int a = 22;
	int b = 12;
	void fun(){
		System.out.println("in fun "+ a);
		System.out.println("in fun "+ b);
	}
}
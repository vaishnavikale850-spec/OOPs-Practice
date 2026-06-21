/*Private constructor = method access static obj and static getter whose return obj of that class & no need to create obj.
*/
class Demo{
	public static void main(String[]args){
		Codex. c.fun();
	}
}

class Codex{
	private Codex(){}
	void fun(){
		System.out.println("in fun");
	}

	static Codex c = new Codex();	
}
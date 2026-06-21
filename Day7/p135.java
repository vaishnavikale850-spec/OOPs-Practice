//final used to prevent overriding
class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
	}
}
class Codex{
	// modifier final not allowed here because child classes can't inherit constructor
	final Codex(){
	
	}
}

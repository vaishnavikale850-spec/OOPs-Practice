/*Static method = Static keyword in java is used to share same variable(properties), method/ function, blocks and nested classes.

eg. student in same school having school name is a static variable.
Share the same property.
Changes can be reflect on static variable or method cana lso be visible for all objects.
 */

class Demo{
	public static void main(String[]args){
		//Codex.fun();
		Codex c = new Codex();
		c.fun();
	}
}

class Codex{
	static void fun(){
		System.out.print("in fun ");
	}
}	
/*
For a single class , it's allowed to create multiple instances.
Class is blueprint used to create objects and it is group of entities(objects).
Object is the instance of class which represent real world entities.
class has it's own 
1. Attributes(properties)= data that object will have
2. Functions(behaviours) = actions that object can perform

Multiple objects are created for a single class. 
Multiple types of data is stored in an object.
*/

class Demo{
	public static void main(String[]args){
		Codex c1 = new Codex();// Suppose c1 has 100 address in heap 
		c1.print();
		Codex c2 = new Codex();// Suppose c2 has 200 address in heap
		c2.print();
// And here c1 & c2 both trigger classes not method.
	}
}
class Codex{	
	void print(){	
		System.out.print("in print ");
	}
}
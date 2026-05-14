// Here object is created but does not assign to a variable (reference variable ) and when I write new Codex(); there will be always a new  object of Codex class created and get the memory in heap , class properties and methods can be accessible after memory allocation but address is not stored because of that new Codex().num = 10;
 this line is useless after completion.
 So, to solve this problem we uses refernce variables for futher accessibility of an object / data. 


class Demo{
	public static void main(String[]args){
		new Codex().display(); // new memory allocation 1
		new Codex().num = 10; // new memory allocation 2 
		new Codex().display(); // new memory allocation 3
	}
}

class Codex{
	int num;
	
	void display(){
		System.out.println("Num is " + num);
	}
}
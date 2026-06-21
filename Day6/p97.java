/*Interface 
1. Interface is not a class.
2. In front of any class we write interface rather than class that becomes interface.
3. Interface is implements not extends
4. Interface is used for main 2 purposes = 
- To achieve total abstraction (do not give implementation but but compulsory to implement all functions inside it)
&
- To perform multiple inheritance (child class implements 2 parents interfaces)
5. Variables in interface are public, static,  final,
6. In child class, for function must have public written otherwise because in interface all methods are public if we don't mention public by default it's type becomes default and throw error.
7. Methods in interface are public and abstract 
*/


class Demo{
	public static void main(String[]args){
		Bear b = new Bear();
		b.eat();
	}
}

//Functional interface = only one abstract method
interface Herbivorous{
	void eat(); // public 
}

interface Carnivorous{
	void eat();
}
class Bear implements Herbivorous, Carnivorous{
	// if public is not written then error is attempting to assign weaker access privileges; was public
	public void eat(){
		System.out.println("Bear is Herbivorous and Carnivorous");
	}
}


/* Overriding = Always should have same data type while overriding.

error: printData() in Child cannot override printData() in Parent
        void printData(){
             ^
  return type void is not compatible with int
*/

class Demo{
	public static void main(String[]args){
		Parent p1 = new Parent();
		p1.printData();
		
		//overriding
		Child c = new Child();
		c.printData();
		
		//upcasting
		Parent p = new Child();
		p.printData();
	}
}

class Parent{
	int printData(){
		System.out.println("in Para");
		return 0;
	}
}

class Child extends Parent{
	void printData(){
		System.out.println("in Child");
	}
}
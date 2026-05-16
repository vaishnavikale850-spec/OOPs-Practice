/*
Object between Relation :  
why?? ----> when we write all properties in a class then the accessibility (accesses that data get complex) and readability issues are created  so, we create different classes for a different properties.

Def : In Java, objects can communicate with each other by forming relationship. 

The main relationship between objects are : 
	1.Association (uses-a) = independent entities communicate with each other. eg. Student -Teacher, Uber , Ola

	2.Aggregation: weak (has-a) = 1 obj contains another obj but both are independent. eg. Teacher department, Amazon product card 
card ----> product 

	3.Composition : strong(has-a) = represent strong ownership where child lifecycle is completely depends on parent.
eg. car and engine,  Google Pay - transaction and receipt, house and room.

*/

//1. Association
/*
class Demo{
	public static void main(String [] args){
		Student s = new Student( "Abhinav");
		Address a = new Address("Satara");
		s.printData(a);	
	}
}

class Address{
	String name;

	Address(String name){
		this.name = name;
	}
}

class Student{
	String name ;
	Student(String name){
		this.name = name;
	}
	void printData(Address a){
		System.out.println(name + "lives in " + a.name);
	}
}
*/

//2. Aggregation
/*
class Demo{
	public static void main(String[]args){
		Teacher t = new Teacher();
		Dept d = new Dept(t);
		d.printData();
		
	}
}

class Teacher{
	String name = "Doremon";
}

class Dept{
	String deptname = "CSE";
	Teacher t;
	
	Dept(Teacher t){
		this.t = t;
	}
	
	void printData(){
		System.out.println(t.name + " from " + deptname);
	}
}
*/

//3. Composition

class Demo{
	public static void main(String[]args){
		Room r = new Room();
		r.printData();
	}
}

class Home{
	String address = "Bengaluru";
}

class Room{
	int cntRoom = 9;
	void printData(){
		Home h = new Home();
		System.out.println("My home is in " + h.address +" and have " + cntRoom + " rooms. " );
	}
	
}

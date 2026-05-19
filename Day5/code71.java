/*
Inheritance is an OOP feature where one class acquires properties and methods from another class using the extends keyword. It represents an IS-A relationship and improves code reusability.
Java supports Single, Multilevel, and Hierarchical inheritance through classes.
Java does not support Multiple and Hybrid inheritance using classes because of ambiguity issues called the Diamond Problem. However, Java achieves multiple inheritance using interfaces through the implements keyword.

Definition of Inheritance
Inheritance is an OOP concept where one class acquires the properties and behaviors of another class using the extends keyword.
Existing class → Parent / Super / Base class
New class → Child / Sub / Derived class
Purpose:
1. Code reusability
2. Method overriding
3. Runtime polymorphism
4. Better code organization

 “Inheritance in Java is the mechanism through which one class can reuse the fields and methods of another class. It represents an IS-A relationship.

For example, a Car IS-A Vehicle, Dog IS-A Animal.
Java supports inheritance using the extends keyword for classes and implements keyword for interfaces.”
Types of Inheritance in Java
There are mainly 5 types:
1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance
4. Multiple Inheritance
5. Hybrid Inheritance

Real life examples:

1. Single : Dog → Animal
2. Multilevel :	Student → Person → LivingBeing
3. Hierarchical : Car & Bike inherit Vehicle
4. Multiple : Child inherits qualities from Father and Mother
5. Hybrid : SmartPhone acts as Camera + MusicPlayer + Phone

1. Single Inheritance : When one child class inherits from one parent class.
Developer is  a Employee

*/

class Demo{
	public static void main(String[]args){
		Developer d1 = new Developer("Vaishnavi",300, "Pune", "Real- Estate", "Lenovo", 200);
		Developer d2 = new Developer("Abhinav", 200, "Pune", "E- Commerce", "HP", 300);

		System.out.println("Developer name is "+ d1.getName() + " Salary is " + d1.getSal() + " working on " + d1.getprojName());
		System.out.println("Developer name is "+ d2.getName() + " Salary is " + d2.getSal() + " working on " + d2.getprojName());
	}
}

class Employee{
	String name; 
	int sal;
	String address;

	Employee(String name, int sal, String address){
		this.name = name;
		this.sal = sal;
		this.address = address;
	}
	
	String getName(){
		return name;
	}
	
	int getSal(){
		return sal;
	}

	String getAdd(){
		return address;
	}
	
}

class Developer extends Employee{
	
	String projName;
	String laptopName;
	int l_price;
	
	Developer(String name, int sal, String address, String projName, String laptopName, int l_price){
		super(name, sal, address);
		this.projName = projName;
		this.laptopName = laptopName;
		this.l_price = l_price;
	}

	String getprojName(){
		return projName;
	}
	
	String getlaptopName(){
		return laptopName;
	}

	int getPrice(){
		return l_price;
	}
	
}


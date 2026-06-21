/*
Constructor : Constructor is a special method which is invoked automatically at the time of object creation.
1. Constructors are used to initialize instance variable.
2. Constructor has same name as class name.
3. Constructor doesn't have any return type (Not even void).
4. Memory allocations happens when constructor is called.
5.Only once's constructor is called at the time of object creation.
6. Every class has it's own by default constructor, if we will not created.

Types of Constructors:
1. Non - Parameterized : Does not accept data.
2. Parameterized : Does accept data.
3. Copy Constructor : Object2 can copy all the properties of object1.
4.Default constructor : It is called by java automatically when we will not create constructor. 

Obj1 ==> 100
Obj2 ==> 100

Object 2 trigger the memory address of  object 1.
so, here when object 1 can change it properties then that changes also reflect in object2.
eg. when someone forgot their password.
 
By using methods and object.
*/

class Demo{
	public static void main(String[]args){
		Student s1 = new Student();
		s1.name = "Ram";
		s1.marks[0] = 70; // Phy marks
		s1.marks[1] = 75; // Chem marks
		s1.marks[2] = 60; // Maths marks
		s1.password = "abc";
		s1.display();
		
		Student s2 = s1;	
		s2.password = "xyz";
		s2.display();
	}
}

class Student{
	String name;
	int marks [] = new int [3];
	String password;
	
	void display(){
		System.out.println("Name is " + this.name);
		System.out.println("Marks of Phy : " + this.marks[0] + "Marks of Chem : " + this.marks[1] + "Marks of Maths : " + this.marks[2]);
		System.out.println("Password is "+ this.password);
	}
}


/*
Creating 2 objects and assigning values i.e  students objects are created.
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
		Student s2 = new Student();	
		s2.name = "Radha";
		s2.marks[0] = 65; // Phy marks
		s2.marks[1] = 90; // Chem marks
		s2.marks[2] = 80; // Maths marks
		s2.password = "xyz";
		s2.display();
	}
}

class Student{
	String name;
	int marks [] = new int [3];
	String password;
	
	void display(){
		System.out.println("Name is " + name);
		System.out.println("Marks of Phy : " + marks[0] + "Marks of Chem : " +marks[1] + "Marks of Maths : " + marks[2]);
		System.out.println("Password is "+ password);
	}
}


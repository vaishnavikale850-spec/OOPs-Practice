class Demo{
	public static void main(String[]args){
		Teacher t1 = new Teacher("Priyanaka", 12345, 100);
		Teacher t2 = new Teacher("Bhosale", 2335, 200);
		Student s1 = new Student("Vaishnavi", 256, 20);
		Student s2 = new Student("Radha", 2536, 18);
		System.out.println("Teacher : ");

		System.out.println("Teacher name : " + t1.getName() + " Phone No." + t1.getphone() + " Teacher Salary : "  + t1.getsal());
		System.out.println(" Teacher name : " + t2.getName() + " Phone No." + t2.getphone() + " Teacher Salary : "  + t2.getsal());

		System.out.println("Student : ");

		System.out.println("Student name : " + s1.getName() + " Phone No." + s1.getphone() + " Student marks : "  + s1.getMarks() + "Student sal : " + s1.getsal());
		System.out.println("Student name : " + s2.getName() + " Phone No." + s2.getphone() + " Student marks : "  + s2.getMarks());

		
	}
}

class Teacher{
	String name;
	int phoneNo;
	int sal; 

	Teacher(String name, int phoneNo, int sal){
		this.name = name;
		this.phoneNo = phoneNo;
		this.sal = sal;
	}

	String getName(){
		return name;
	}

	int getphone(){
		return phoneNo;
	}

	int getsal(){
		return sal;
	}

}

class Student extends Teacher {
	int marks;
		
	Student(String name, int phoneNo, int marks){
		super(name, phoneNo, 0);
		this.marks = marks;
	}
	int getMarks(){
		return marks;
	}
}
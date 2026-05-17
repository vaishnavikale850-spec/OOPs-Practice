class Demo{
	public static void main(String[]args){
		Teacher t1 = new Teacher("Priyanka Salunkhe ", 1234, "Satara", 100);
		System.out.println("Teacher : ");
		System.out.println("Teacher name : " + t1.getName() + "Phone Number :"+ t1.getphoneNo() +  "Address : "  + t1.getAdd() + "Salary : " + t1.getSal());
				
		Student s1 = new Student(19);
		System.out.println("Student : ");
		System.out.println("Name : " + s1.getName() + "Marks : "+ s1.getMarks());

			
	}
}

class Teacher{
	String name;
	int phoneNo;
	String address;	
	int sal;	

	Teacher(String name, int phoneNo, String address, int sal){
		this.name = name;		
		this.phoneNo = phoneNo;
		this.address = address;
		this.sal = sal;
	}
		
	String getName(){
		return name;
	}
		
	int getphoneNo(){
		return phoneNo;	
	}
	String getAdd(){
		return address;
	}
	
	int getSal(){
		return sal;	
	}	
}

class Student extends Teacher{	
	int marks ;
	
	Student(int marks){
		super("Abhi", 123456, "Pune" , 0);
		this.marks = marks;
	}	
	
	int getMarks(){
		return marks;
	}
}	
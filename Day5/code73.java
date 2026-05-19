/*
3. Hierarchical Inheritance : Multiple child classes inherit from the same parent class.
In hierarchical inheritance, multiple child classes share one common parent class.
This avoids duplicate code because common methods are written only once in the parent class.

*/

class Demo{
	public static void main(String[]args){

		//Developer
		System.out.println("Parent Developer : ");
		Developer d1 = new Developer("Vaishnavi",300, "Pune", "Real- Estate", "Lenovo", 200);
		Developer d2 = new Developer("Abhinav", 200, "Pune", "E- Commerce", "HP", 300);

		
		//System.out.println("Developer name is "+ d1.getName() + " working on " + d1.getprojName() + " with " + d1.getTech() + "technology"); donot access tech it is child a method.
		System.out.println("Developer name is "+ d2.getName() + " working on " + d2.getprojName());

		System.out.println("-------------------------------------------");

		//Frontend
		System.out.println("Frontend Developer : ");

		FrontendDev f1 = new  FrontendDev("Vaishnavi",300, "Pune", "Real- Estate", "Lenovo", 200,"HTML", 1);
		 FrontendDev f2 = new  FrontendDev("Abhinav", 200, "Pune", "E- Commerce", "HP", 300 ,"CSS", 2);

		System.out.println("Frontend Developer name is "+ f1.getName() + " working on " + f1.getprojName() + " with " + f1.getTech() + "technology");
		System.out.println("Developer name is "+ f2.getName() + " working on " + f2.getprojName() + " with " + f2.getTech() + " technology");
		System.out.println("-------------------------------------------");

		//backend

		BackDev b1 = new BackDev("Vaishnavi",3000, "Bengaluru", "Finance Project", "Lenovo", 200,"Advance JAVA");
		BackDev b2 = new BackDev("Abhinav",3000, "Bengaluru", "Society Management System Project", "MacBook", 3000,"Python");

		System.out.println("Backend Developer name is "+ b1.getName() + " working on " + b1.getprojName() + " with " + b1.getTech() + "technology");
		System.out.println("Developer name is "+ b2.getName() + " working on " + b2.getprojName() + " with " + b2.getTech() + " technology");

		System.out.println("-------------------------------------------");

		
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

class FrontendDev extends Developer{
	String tech;
	int proj_days;

	FrontendDev(String name, int sal, String address, String projName, String laptopName, int l_price, String tech, int proj_days){
		super(name, sal, address, projName, laptopName, l_price);
		this.tech = tech;
		this.proj_days = proj_days;
	}

	String getTech(){
		return tech;
	}

	int getProj_days(){
		return proj_days;
	}
}


class BackDev extends Developer{
	String tech;

	BackDev(String name, int sal, String address, String projName, String laptopName, int l_price, String tech){
		super(name, sal, address, projName, laptopName, l_price);
		this.tech = tech;
	}

	String getTech(){
		return tech;
	}

}

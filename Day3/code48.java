/*
In these code, we see that the getter and aggeration combined as single unit and the usability and readability is also effective. 
Only need to access single and the getter we can get all access on the properties. 
*/

class Demo{
	public static void main(String [] args){
		Company c  = new Company("TCS", "Development");
		Employee e = new Employee("Vaishnavi", 2000, c );
		System.out.println(e.getName() + " is working in " + e.getComp().getCompName() + " in " + e.getComp().getDept() + " department\n has salary of rupees " + e.getSal());
	}
}

class Company{
	String compName;
	String dept;
	
	Company(String compName, String dept){
		this.compName = compName;
		this.dept = dept;
	}

	String getCompName(){
		return compName;
	}

	String getDept(){
		return dept;
	}
}
class Employee{
	String name;	
	int sal;	
	Company comp;

	Employee(String name, int sal, Company comp){
		this.name = name;
		this.sal = sal;
		this.comp = comp;
	}

	String getName(){
		return name;
	}

	int getSal(){
		return sal;
	}
		
	Company getComp(){
		return comp;
	}
}
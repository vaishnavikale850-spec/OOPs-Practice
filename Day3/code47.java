/*
Getter (get): This is used for getting the value and it is compulsory to have  a return type for each getter and do not accept any data.
*/

class Demo{
	public static void main(String [] args){
		Employee e = new Employee("Vaishnavi", "TCS", 2000, "Development");

	System.out.println("Name is "+ e.getName() + " working in " + e.getCompName() + " in " + e.getDept() + " department and her salary is "+ e.getSal());
	}
}

class Employee{
	String name;
	String compName;
	int sal;	
	String dept;

	Employee(String name, String compName, int sal, String dept){
		this.name = name;
		this.compName = compName;
		this.sal = sal;
		this.dept = dept;
	}

	String getName(){
		return name;
	}

	String getCompName(){
		return compName;
	}
	int getSal(){
		return sal;
	}
	String getDept(){
		return dept;
	}	
}
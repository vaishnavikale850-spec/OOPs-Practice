/*Constructor Overloading */
class Demo{
	public static void main(String[]args){
		Employee e = new Employee();
		Employee e1 = new Employee("Radha");
		Employee e2 = new Employee("Abhinav", 1000);
	}
}

class Employee{
	String name;
	 int sal;

	Employee(){
		System.out.println("non - para const");
	}
	Employee(String n){
		name = n;
		System.out.println("para const " + name );
	}
	Employee(String n, int s){
		name = n;
		sal = s;
		System.out.println("para const " + name +"\n Salary is "+sal );

	}	
}
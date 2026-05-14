/*
Constructor Overloading
*/

class Demo{
	public static void main(String[]args){
		System.out.println("---Data of obj ---");
		Employee e = new Employee();
		e.display();
		Employee e1 = new Employee(22);
		e1.display();
		
	}
}

class Employee{
	int a = 12 ; 

	Employee(){
		
	}
	
	Employee(int num){
		a = num;
	}
	void display(){
		System.out.println("Data is "+ a);
	}

}
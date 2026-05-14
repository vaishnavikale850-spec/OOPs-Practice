/*
Constructor Overloading
*/

class Demo{
	public static void main(String[]args){
		Employee e = new Employee();
		Employee e2 = new Employee();
		Employee e1 = new Employee(22);
		
	}
}

class Employee{
	int a = 12 ; 

	Employee(){
		System.out.println("in non - para const");
	}
	
	Employee(int num){
		System.out.println("in para const");
	}

}
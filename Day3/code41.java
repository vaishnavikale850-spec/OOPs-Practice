/*
For a single constructor there can be multiple objects.
*/

class Demo{
	public static void main(String [] args){
		Codex c1 = new Codex("Radha",123,"Satara");
		Codex c2 = new Codex("Sita",234,"Pune");
		Codex c3 = new Codex("Ram",4556,"Delhi");
		Codex c4 = new Codex("Raj",3455,"Mumbai");
		Codex c = new Codex();
		c.printdata();
		c1.printdata();
		c2.printdata();
		c3.printdata();
		c4.printdata();

	}
}

class Codex{
	String name;
	int phoneNo;
	String address;
	
	Codex(){}
	Codex(String name , int phoneNo , String address){
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	void printdata(){
		System.out.println("Name is " + name);
		System.out.println("Phone Number is "+ phoneNo);
		System.out.println("Address is "+ address);
		System.out.println("----------------------------");
	}
}
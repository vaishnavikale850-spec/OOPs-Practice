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
		System.out.println("------After some time------");
		c2.setphNo(45678);
		c4.setAdd("Sangali");
		System.out.println(c2.phoneNo);
		System.out.println(c4.address);
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
	
	 void setphNo(int phoneNo){
		this.phoneNo = phoneNo;
	}

	void setName(String name){
		this.name = name;
	}

	void setAdd(String address){
		this.address = address;
	}	


	void printdata(){
		System.out.println("Name is " + name);
		System.out.println("Phone Number is "+ phoneNo);
		System.out.println("Address is " + address);
	}
}
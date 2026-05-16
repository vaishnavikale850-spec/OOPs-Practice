class Demo{
	public static void main(String[] args){
		Dept d = new Dept("CSE");
		Emp e = new Emp("Radha", d);
		System.out.println(e.getName() + " is in "+ e.getDeptAdd().DeptName());
	}
}

class Emp{
	String name;
	Dept deptAdd;

	Emp(String name, Dept deptAdd){
		this.name = name;
		this.deptAdd = deptAdd;
	}

	String getName(){
		return name;
	}
	
	Dept getDeptAdd(){
		return deptAdd;
	}
}


class Dept{
	String name;

	Dept(String name){
		this.name = name;
	}

	String DeptName(){
		return name;
	}

}
// We can't write constructor for interface because every single thing writtern in interface is abstract and public.
class Demo{
	public static void main(String[]args){
		
	}
}

interface Num{
	num(){}
}


class Num1 implements Num{
	void printNum(){
		System.out.println("");
	}
}


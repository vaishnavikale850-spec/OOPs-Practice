/*1. It runs before constructor.
2. All non - static block get executed before constructor get called.
3.Diffrence between constructor and non - static block is that parameter for an object can be differ for constructor is called by num of paarmeters but in block only need to create object either it parameterized or none.
*/

class Demo{
	public static void main(String[]args){
		Demo d = new Demo();
		System.out.println("in main");
		Demo d1 = new Demo();
	}

	{
		System.out.println("in non static block1");
	}
	
	{
		System.out.println("in non static block2");
	}

}


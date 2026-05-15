/*
Non - Static block / Instance block :
1.Non - static block run every time when the object is created.
2. It runs before constructor.
3. All non - static block get executed before constructor get called.
4.Non static block donot have any keyword.
5. Memory = object create.
6. Do not need to call, it is called automatically.
7.Object - level initialization = used for common object initialization before constructor run.
8.All non - static blocks executed when object called.
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

/*Output : 
in non static block1
in non static block2
in main
in non static block1
in non static block2
*/

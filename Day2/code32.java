/*
Static block :
1.Static block executed only once when the class is loaded by JVM.
2. Static block executed only once before main() method.
3.Stored in class area.
4. Do not need to call, it is called automatically.
eg. PhonePe : need to establish secure configurations only once when application starts.
5. Memory = class loads.
6. Class level initialization

eg for both blocks = 
1.School opening ceremony happens once and there is attendance system startup are the static block.
But every student (object) id use that attendance system for (attendance marking) multiple time is the non static block.
2. In fintech application (PhonePe) static block initialize payment gateway setting once while non static block initialize customer specific setteing multiple time.
static block > non-static block > constructor.
*/

class Demo{
	public static void main(String[]args){
		System.out.println("in main");
	}

	static{
		System.out.println("in static block");
	}
}

/*Output : 
in static block 
in main*/

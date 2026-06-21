/*
POP = Procedure Oriented Programming Language = C (Dennies Richie)
OOP = Object Oriented Programming Language = Java (James Gosaling (1995 sun Microsystem))
POP & OOP = Procedure Oriented Programming Language 
&
 Object Oriented Programming Language = CPP, Python, JavaScript
Java is hybrid language = support oops and pop both. Focus on both functions and classes and object also.

code pop = simple calling a method (static method)
code oop = object creation (non-static method)

# POP = focus on methods/ functions
1. Class Not Present.
2. Not well structured code.
3. Readability issues
CP : 
void opd(){
	print("opd");
}
void icu(){
	print("icu");
}
void veg(){
	print("veg");
}
void main(){
	opd();
	icu();
	veg();
}
getch;

OOPs = focus on OOP concepts like (class, object, interfaces, abstract class, inheritance, polymorphism, Encapsulation )

Why java is not pure oop ??
Smalltalk language are called as pure oop because it contains everything is object but in java 
int a = 10;
here int (Primitive data types) but not class this made java almost oops and a are not object.

eg. phonepe , car, food delivery application
procedural op = Verifying otp, chech balance, deduct money, update
oops = object = user, bankaccount, transaction, wallet 
*/
class Demo{
	public static void main(String[]args){
		Demo.veg();
		Demo.opd();
		Demo.icu();
		
	}

	static void veg(){
		System.out.println("in veg");	
	}

	static void opd(){
		System.out.println("in opd");	
	}

	static void icu(){
		System.out.println("in icu");	
	}
}






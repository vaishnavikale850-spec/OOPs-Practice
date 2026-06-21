/*
Abstract Class = When child override parent properties then the body implementation inside parent is useless and code becomes less effective (object cannot be created because inside abstarct method nothing implementation have written so what it's implements(print)???).
1. Abstarct class = Inside abstract class, body don't implement.It acts as a blueprint for other classes.Because abstract classes are incomplete and can't create object.
Constructor can allow to write.

It is used to provide:
1.Common properties
2.Common methods
3.Partial abstraction = Showing important details(method) and hiding implementation details.
Vehicle System:

Every vehicle:
starts
stops

But implementation is different.
Car starts with key/button
Bike starts with kick/self-start

Without inherit any class still it is complusory to write implementation.
*/

class Demo{
	public static void main(String[]args){
		//Vehicle v = new Vehicle();Vehicle is abstract; cannot be instantiated.
		Bike b = new Bike();
		b.start();
		b.stop();
		System.out.println("-------------");
		Car c = new Car();
		c.start();
		c.stop();
		
	}
}

abstract class Vehicle{
	abstract void start();
	abstract void stop();	

} 
class Bike {
	void start(){
		System.out.println("bike start");
	}
	
	void stop(){
		System.out.println("bike stop");
	}
}

class Car{
	void start(){
		System.out.println("car start");
	}

	void stop(){
		System.out.println("car stop");
	}
}
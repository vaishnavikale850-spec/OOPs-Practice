/*
Abstract class contains normal, abstract method and variables.
*/

class Demo{
	public static void main(String[]args){
		Car c =new Car();
		c.start();
		c.stop();
	}
}

abstract class Vehicle{
		 //abstarct method should not have body
		abstract void start();

		//normal method should have body
		void stop(){};
}

class Car{
	void start(){
		System.out.println("car start");
	}

	void stop(){
		System.out.println("car stop");
	}

	
}
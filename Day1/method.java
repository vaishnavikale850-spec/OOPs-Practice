/*
Method  = Method is a reusable block of code used to perform a task.
Data Accept 
Data Process
Data Return 
eg. Method which perform addition of 2 n0's
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		int sum = sum(a,b);		
		System.out.print("Sum is : "+sum);
	}
	
	static int sum(int a, int b){
		return a + b;
	}
}
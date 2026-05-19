/*
4. Multiple Inheritance : One child class inherits from multiple parent classes.

Why multiple inheritance is not supported in Java?
---->To avoid ambiguity problems like the Diamond Problem.
If two parent classes contain the same method, Java cannot determine which method should be inherited.”
Because it creates ambiguity called the:

Diamond Problem: 
Example:
// class C extends A, B  NOT POSSIBLE

Now Java cannot decide which show() method to inherit.
How Java Achieves Multiple Inheritance

Java supports it using interfaces.
 
5. Hybrid Inheritance
Combination of more than one type of inheritance.
Example: Hierarchical + Multiple
Single + Multiple
*/

class Demo{
	public static void main(String []args){
		C c1 = new C();
		c1.show();
	}
}
class A{
    void show() {
        System.out.println("A");
    }
}

class B{
    void show() {
        System.out.println("B");
    }
}

// error: '{' expected
class C extends A, B{
	void fun(this.show());
}

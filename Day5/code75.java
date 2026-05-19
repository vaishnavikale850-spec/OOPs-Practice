/*
Why multiple inheritance is not supported in Java?
---->To avoid ambiguity problems like the Diamond Problem.
If two parent classes contain the same method, Java cannot determine which method should be inherited.”
Because it creates ambiguity called the:

Diamond Problem

Example:

class A {
    void show() {
        System.out.println("A");
    }
}

class B {
    void show() {
        System.out.println("B");
    }
}

// class C extends A, B   NOT POSSIBLE

Now Java cannot decide which show() method to inherit.


---

How Java Achieves Multiple Inheritance

Java supports it using interfaces.
*/
Example

interface Father {
    void money();
}

interface Mother {
    void care();
}

class Child implements Father, Mother {

    public void money() {
        System.out.println("Father provides money");
    }

    public void care() {
        System.out.println("Mother provides care");
    }
}

public class Main {
    public static void main(String[] args) {

        Child c = new Child();

        c.money();
        c.care();
    }
}

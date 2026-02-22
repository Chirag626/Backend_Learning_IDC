package OOPS.abstraction;

/*
====================== INNER CLASSES ======================

Inner class (nested class) = A class declared inside another class or interface.

Why we use inner classes?
1) Inner class can access all members of outer class (even private).
2) Helps in better grouping of related classes → improves readability.
3) Reduces extra code → better code optimization.

Need of Java Inner class Sometimes users need to program a class in such a way so that no other class can access it. 
Therefore, it would be better if you include it within other classes. 

Types used below:
- Normal inner class
- Inner class inside another inner class
- Static inner class
*/

class A {
    private int a;   // private variable of outer class

    // Constructor of outer class
    A() {
        a = 10;
    }

    // Method of outer class
    public void show() {
        System.out.println("A is an Outer Class: " + a);
    }

    // -------- NON-STATIC INNER CLASS --------
    class B {
        public void show() {
            a++; // inner class CAN access private data of outer class
            System.out.println("B is the Inner Class of A: " + a);
        }

        // -------- INNER CLASS INSIDE INNER CLASS --------
        class C {
            public void show() {
                a++; // still accessing outer class variable
                System.out.println("C is Inner Class of B: " + a);
            }
        }
    }

    // -------- STATIC INNER CLASS --------
    static class D {
        public void show() {
            System.out.println("Static class D is an Inner class of A");
        }
    }
}

/*
====================== ANONYMOUS CLASSES ======================

Anonymous class = Class without name.
Created and used at the same time. It's typically used when you need to create a class for a specific purpose and you don't intend to reuse it elsewhere in your code.
Used when:
- You need to override a method only once.
- No need to create a separate reusable class.
*/

// Normal class
class X1 {
    public void show() {
        System.out.println("This is class X1:");
    }
}

// Abstract class (cannot create object directly)
abstract class Employees {
    public abstract void emp_id(int id);
    public abstract void emp_name(String name);
}

public class Inner_Anonymous_Classes {
    public static void main(String[] args) {

        // ================= INNER CLASS DEMO =================

        // 1) Create object of outer class
        A obj1 = new A();
        obj1.show();

        // 2) Create object of NON-STATIC inner class B
        A.B obj2 = obj1.new B();   // need outer object
        obj2.show();

        // 3) Create object of inner class C (inside B)
        A.B.C obj3 = obj2.new C();
        obj3.show();

        // 4) Create object of STATIC inner class D
        A.D obj4 = new A.D();   // no outer object needed
        obj4.show();


        // ================= ANONYMOUS CLASS DEMO =================

        /*
        Normally:
        X1 obj = new X1();
        obj.show();  // calls original method
        */

        // Anonymous class overriding show() of X1
        X1 obj1Anon = new X1() {
            public void show() {
                System.out.println("This is an anonymous class");
            }
        };
        obj1Anon.show(); // calls overridden method of anonymous class


        // Anonymous class implementation of abstract class Employees
        Employees e = new Employees() {

            // local variables inside anonymous class
            int id;
            String name;

            // implementing abstract methods
            public void emp_id(int id) {
                System.out.println("Employee id: " + id);
            }

            public void emp_name(String name) {
                System.out.println("Employee name: " + name);
            }
        };

        // calling methods of anonymous Employees object
        e.emp_id(1);
        e.emp_name("Chirag");
    }
}

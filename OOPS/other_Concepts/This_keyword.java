 package OOPS.other_Concepts;
/*
 This Keyword --> There can be a lot of usage of Java this keyword.
 In Java, this is a reference variable that refers to the current object
 and we know that instance variables are the part of object.

 eg:
 this --> Reference Variable , STATE & BEHAVIOUR --> Object

 Here are the 6 usages of java this keyword.

 1. this can be used to refer current class instance variable.
 2. this can be used to invoke current class method (implicitly).
 3. this() can be used to invoke current class constructor.
 4. this can be passed as an argument in the method call.
 5. this can be passed as argument in the constructor call.
 6. this can be used to return the current class instance from the method.
*/

class Stud {

    int S_age;
    String S_name;

    // 3️⃣ Constructor chaining using this()
    Stud() {
        this(18, "Default");   // calling parameterized constructor
    }

    Stud(int S_age, String S_name) {
        // 1️⃣ Referring current class instance variables
        this.S_age = S_age;
        this.S_name = S_name;
    }

    // Method to set data
    public void data(int S_age, String S_name) {
        // 1️⃣ Differentiating instance & local variables
        this.S_age = S_age;
        this.S_name = S_name;

        // 2️⃣ Calling current class method using this
        this.show();
    }

    // Display method
    public void show() {
        System.out.println("Student Name: " + S_name);
        System.out.println("Age: " + S_age);
    }

    // 4️⃣ Passing this as argument in method call
    void displayObject(Stud s) {
        System.out.println("Object received: " + s.S_name);
    }

    void callDisplay() {
        displayObject(this);   // passing current object
    }

    // 5️⃣ Passing this in constructor call
    Stud(Stud s) {
        this.S_age = s.S_age;
        this.S_name = s.S_name;
    }

    // 6️⃣ Returning current object
    Stud returnObject() {
        return this;
    }
}

public class This_keyword {
    public static void main(String[] args) {

        // Normal object creation
        Stud s1 = new Stud();
        s1.data(21, "CHIRAG");

        System.out.println("------ Passing this as argument ------");
        s1.callDisplay();

        System.out.println("------ Copy using constructor (this in constructor) ------");
        Stud s2 = new Stud(s1);
        s2.show();

        System.out.println("------ Returning current object ------");
        Stud s3 = s1.returnObject();
        s3.show();

        // NOTE:
        // this.show() ❌ cannot be used inside static method (main)
        // because 'this' refers to current object
        // and static method belongs to class, not object.
    }
}



/*
----------- Memory Diagram---------------

s1 ─────┐
        │
        ▼
     [ Stud Object ]
     S_age = 21
     S_name = CHIRAG
        ▲
        │
s3 ─────┘   (same object) both pointing the same object...

s2 ──► [ New Stud Object ]
        S_age = 21
        S_name = CHIRAG



*/
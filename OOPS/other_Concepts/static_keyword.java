 package OOPS.other_Concepts;

/*
Static Keyword -->
The static keyword in Java is mainly used for memory management.
It can be applied to variables, methods, blocks, and nested classes.
Static members belong to the class rather than to objects of the class.

Static can be used with:

• Variable (class variable)
• Method (class method)
• Block
• Nested/Inner class

Main restrictions of static methods:

1. A static method cannot directly access non-static data members or call non-static methods.
2. Keywords 'this' and 'super' cannot be used inside a static context.
 */
public class static_keyword {

    public static void main(String[] args) {

        // Example of static variable
        // Static variables are accessed using the class name.
        Student_S.college_name = "ITM";

        Student_S s1 = new Student_S();
        s1.Student_name = "Chirag";
        s1.rollno = 101;
        s1.show();

        Student_S s2 = new Student_S();
        s2.Student_name = "Rianchal";
        s2.rollno = 102;
        s2.show();

        // Example of static methods
        // Static methods can be called directly using the class name.
        Student1.staticMethod();

        // Passing object reference to access non-static data inside a static method
        String print = Student1.display(s2);
        System.out.println(print);

        // Static Nested Class examples
        // Example 1: Creating object of static nested class
        TestOuter1.Inner obj = new TestOuter1.Inner();
        obj.msg();

        // Example 2: Calling static method of static nested class
        TestOuter1.Inner1.show();

        
        // Non - Static Inner Class Example:
        // Step 1: Create outer class object (mandatory)
        TestOuter1 outer = new TestOuter1();
        outer.marks = 95.5f;

// Step 2: Create inner class object using outer object
        TestOuter1.Inner2 innerObj = outer.new Inner2();

// Step 3: Call method
        innerObj.showDetails();

    }
}

/*
Static Variable:
A static variable represents a property that is common for all objects.
It gets memory only once when the class is loaded.

Example:
If a college has 500 students, each student has a unique roll number and name
(non-static), but the college name is common for all (static).
Static variables should be accessed using the class name instead of an object reference.
 */
class Student_S {

    // Here, "college_name" refers to the common property of all objects. If we make it static, this field will get the memory only once.
    static String college_name;
    int rollno;
    String Student_name;

    public void show() {
        System.out.println(Student_name + ": " + rollno + ", " + college_name);
    }
}

class Student1 {

    /*
    Static Block:
    • Used to initialize static variables.
    • Executes once when the class is loaded.
    • Runs before the main() method.
     */
    static String branch;
    // note : Static block runs when his class is loaded for the first time, not necessarily before the main method. that's why in o/p it's showing in 3rd line.

    static {
        branch = "CSE";
        System.out.println("This is a static block: " + branch);
    }


    /* 
Static Methods : 
* Inside the static method we can only use static variable not non-static or instance variable. 
* We can call static method directly by class name.
* A static method belongs to the class rather than the object of a class. 
* A static method can be invoked without the need for creating an instance of a class.
* A static method can access static data member and can change the value of it.
* To use non-static data, an object reference must be passed as a parameter. 

 ex : Student1.display(); here student is a class and show is a static method. 
and if we want to use non static variables in a static we simply pass the object reference in static method. 
 ex: Student1.display(s2); // here s2 is an object reference of Student Class.
     */
    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    /*
    This "display(Student_S s)" is a static method, so it can be called using the class name
    without creating an object of Student1.
    
    Since static methods cannot directly access non-static (instance)
    variables of another class, we pass the Student_S object as a parameter.
    
    Parameter 's' contains:
    • s.rollno        → student's roll number (instance data)
    • s.Student_name  → student's name (instance data)
    
    'School_name' is static, so it can be accessed directly
    without any object reference.
     */
    static String School_name = "Neil World";

    public static String display(Student_S s) {
        // Returning a formatted string containing student details
        return "[" + s.rollno + ", " + s.Student_name + ", " + School_name + "]";
    }

}

/*
Static Nested Class:
A class defined inside another class with the static keyword is called a static nested class.

Key points:
1. It can access static members of the outer class (even private).
2. It cannot access non-static (instance) members of the outer class.
3. It can be accessed using the outer class name without creating
   an object of the outer class.
 */
class TestOuter1 {

    // Static data member → belongs to class, shared by all objects
    private static int data = 30;

    // Another static variable → can be accessed using class name
    static String name = "Raju";

    // Non-static (instance) variable → belongs to object of outer class
    float marks;


    /*
    ================= STATIC NESTED CLASS =================
    • Declared using 'static' keyword inside outer class.
    • Does NOT need outer class object to be created.
    • Can access ONLY static members of outer class.
     */
    static class Inner {

        // Constructor → runs when Inner class object is created
        Inner() {
            System.out.println("This is a static inner class object");
        }

        void msg() {
            // marks = 99.9f;  ❌ Not allowed
            // Reason: static inner class cannot access non-static members directly

            // ✔ Can access static variable of outer class
            System.out.println("Without static method, value of data is " + data);
        }
    }


    /*
    Another static nested class with static method
    • Static method can be called directly using:
      TestOuter1.Inner1.show();
     */
    static class Inner1 {

        static void show() {
            // Accessing static variable of outer class
            System.out.println("With static method, the name is " + name);
        }
    }


    /*
    ================= NON-STATIC INNER CLASS =================
    • Also called Member Inner Class.
    • MUST create outer class object first.
    • Can access BOTH:
        → static members
        → non-static (instance) members of outer class.
     */
    class Inner2 {

        void showDetails() {

            // ✔ Access static variable directly
            System.out.println("Accessing static data: " + data);

            // ✔ Access non-static variable of outer class object
            System.out.println("Accessing non-static marks: " + marks);
        }
    }
}

/*
1. Shallow Copy : Shallow copy copies primitive values but copies object references.
2. Deep Copy    : Deep copy creates a new copy of both the object and its referenced objects.
 */ 

package OOPS.other_Concepts;

// Class representing a Student
class Stud1 {

    int marks;

    // Normal constructor
    Stud1(int marks) {
        this.marks = marks;
    }

    // Copy constructor → used for DEEP COPY
    Stud1(Stud1 obj) {
        this.marks = obj.marks; // copying value into NEW memory
    }
}

public class Shallow_DeepCopy {

    public static void main(String[] args) {

        // ---------- SHALLOW COPY ----------
        System.out.println("SHALLOW COPY:");

        Stud1 s1 = new Stud1(90);

        // Reference copy → both point to SAME object in memory
        Stud1 s2 = s1;

        // Change using second reference
        s2.marks = 50;

        // Both values change because memory is shared
        System.out.println("s1 marks = " + s1.marks); // 50
        System.out.println("s2 marks = " + s2.marks); // 50


        // ---------- DEEP COPY ----------
        System.out.println("\nDEEP COPY:");

        Stud1 s3 = new Stud1(80);

        // New object created using copy constructor
        Stud1 s4 = new Stud1(s3);

        // Change only copied object
        s4.marks = 40;

        // Original remains unchanged
        System.out.println("s3 marks = " + s3.marks); // 80
        System.out.println("s4 marks = " + s4.marks); // 40
    }
}

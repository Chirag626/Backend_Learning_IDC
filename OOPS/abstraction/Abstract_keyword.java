package OOPS.abstraction;
// =====================================================
// Demonstration of ALL possible uses of abstract keyword
// =====================================================
/*
abstract keyword can be used with: "Class and Methods"

❌ Cannot be used with:
Variable, Constructor, Static method (with abstract), Final method, Private method
 */
// -----------------------------------------
// 1️⃣ Abstract Class
// -----------------------------------------
abstract class Emps {

    // -----------------------------------------
    // ✅ Instance Variable (Allowed)
    // -----------------------------------------
    protected String name;
    protected int baseSalary;

    // -----------------------------------------
    // ✅ Constructor (Allowed)
    // Abstract class CAN have constructor
    // It is called when child object is created
    // -----------------------------------------
    public Emps(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        System.out.println("Employee constructor called");
    }

    // -----------------------------------------
    // ✅ Abstract Method (Allowed)
    // No body
    // Must be implemented by concrete child
    // -----------------------------------------
    abstract int calculateSalary();

    // -----------------------------------------
    // ✅ Concrete Method (Allowed)
    // Abstract class CAN have normal methods and can be accessed through a reference variable of the subclass(child).
    // -----------------------------------------
    public void displayInfo() {
        System.out.println("Name: " + name);
    }

    // -----------------------------------------
    // ✅ Static Method (Allowed)
    // But cannot be abstract static
    // -----------------------------------------
    public static void companyPolicy() {
        System.out.println("Company policy: 9 hours work.");
    }

    // -----------------------------------------
    // ❌ NOT ALLOWED (Examples)
    // -----------------------------------------

    // abstract static void test();   ❌ Invalid
    // Reason: static methods cannot be overridden

    // abstract final void test();    ❌ Invalid
    // Reason: final methods cannot be overridden

    // abstract private void test();  ❌ Invalid
    // Reason: private methods are not visible to child
}


// -----------------------------------------
// 2️⃣ Abstract Child Class (Allowed)
// Implementation delayed
// -----------------------------------------
abstract class PermanentEmployee extends Emps {

    protected int bonus;

    public PermanentEmployee(String name, int baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // Not implementing calculateSalary()
    // So this class must also be abstract
}


// -----------------------------------------
// 3️⃣ Concrete Class (Final Implementation)
// -----------------------------------------
class Developer extends PermanentEmployee {

    public Developer(String name, int baseSalary, int bonus) {
        super(name, baseSalary, bonus);
    }

    // -----------------------------------------
    // ✅ Overriding abstract method
    // Required because this class is concrete
    // -----------------------------------------
    @Override
    int calculateSalary() {
        return baseSalary + bonus;
    }
}


// -----------------------------------------
// 4️⃣ Main Class
// -----------------------------------------
public class Abstract_keyword {

    public static void main(String[] args) {

        // -----------------------------------------
        // ❌ Cannot create object of abstract class
        // -----------------------------------------
        // Employee e = new Employee("Rahul", 50000); ❌ ERROR

        // -----------------------------------------
        // ✅ Upcasting (Runtime Polymorphism)
        // -----------------------------------------
        Emps emp = new Developer("Rahul", 50000, 10000);

        emp.displayInfo();   // Concrete method
        System.out.println("Salary: " + emp.calculateSalary());

        // -----------------------------------------
        // ✅ Static method call
        // -----------------------------------------
        Emps.companyPolicy();

        System.out.println(emp.name); // accessing abstract class variables...
    }
}

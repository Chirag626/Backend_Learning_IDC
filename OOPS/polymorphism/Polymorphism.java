 package OOPS.polymorphism;
// 
/* Polymorphism --> "Same object having different behviour". where "Poly" means "Many" & "Morphism" means "Forms".
 *  There are two types:
 1.  Compile time polymorphism / Method Overloading / Static Polymorphism /Early Binding.
 2.  Run time polymorphism / Method Overriding / Dynamic Polymorphism / Late Binding.

 Dynamic Polymorphism --> The polymorphism which exist in Runtime called Dynamic poly...
 * Here compiler doesn't have any idea regarding method calling, At runtime "JVM" is going to decide that which method
   will be invoked depending upon the class type.
 * Parent and child class both contain same function with a  different defination.
 * We can achieve overriding through Inheritance without inheritance we can't achieve overriding.
 * Methods ke nam or parameteres exactly same hone chahiye.
 * Generally we can't change the return type of the method while overriding a method but by using
   "co-variant" concept we can change the return type.
   
 
   
  Static Polymorphism -->
  *  Method overloading depends on method parameters,not only on return type.
  *  Constructor can be overload but can't override.
  */



/*Quick Notes :
* Method Overloading :
---------------------
Same method name
Different parameters
Decided at compile time

* Method Overriding :
--------------------
Requires inheritance
Same method name + parameters
Decided at runtime (JVM)
*/
// ===================== METHOD OVERLOADING =====================
 class Calculator
 {
    // Same method name but different parameters → Overloading
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    float sum(float a,float b)
    {
        return a+b;
    }
 }


// ===================== METHOD OVERRIDING =====================

 class Animal_s
 {
    void eat()
    {
        System.out.println("eats anything ");
    }
 }

// Child class overriding parent method 
class Cow extends Animal_s
{
    @Override // Optional but good practice
    void eat() // overriden method
    {
        System.out.println("Cow eats Grass");
    }
}
class Horse extends Animal_s
{
    @Override
    void eat()
    {
        System.out.println("Horse eats Grass and Grains");
    }
}



public class Polymorphism {
    public static void main(String[] args) 
    {

       // ----------- COMPILE-TIME POLYMORPHISM (OVERLOADING) -----------
       System.out.println("Outputs of Overloading/CompileTime Polymorphism : ");
       Calculator c = new Calculator();
       
       System.out.println("Sum of 3 integers: " + c.sum(4, 5, 6));
       System.out.println("Sum of floats: " + c.sum(2.5f, 4.8f));
       System.out.println("Sum of 2 integers: " + c.sum(7, 3));
       
       
       // ----------- RUN-TIME POLYMORPHISM (OVERRIDING) -----------
       
       System.out.println("\nOutputs of Overriding/Runtime Polymorphism : ");
       // Upcasting → Parent reference holding child object
        Animal_s a = new Cow();
        a.eat();   // Runtime decides → Cow.eat()

        Animal_s x = new Horse();
        x.eat();   // Runtime decides → Horse.eat()


        // ----------- DOWNCASTING CONCEPT -----------
        // Valid downcasting example
        Animal_s obj = new Cow();   // upcasting
        Cow c1 = (Cow) obj;         // safe downcasting
        c1.eat();

        // Invalid runtime downcasting example (will cause ClassCastException)
        // Animal_s obj2 = new Animal_s();
        // Cow c2 = (Cow) obj2;   // ❌ Runtime error

    }
}

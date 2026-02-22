/*
It constructs the values at the time of object creation. 
It is not necessary to write a constructor for a class. 
It is because java compiler creates a default constructor if your class doesn't have any.
Whenever we create an object then the constructor will be automatically called and executed.

Rules -->
1. A Constructor name must be the same as its class name.
2. A Constructor must have no explicit return type.if we try to put return type then it will become normal method.
3. A Java constructor cannot be abstract, static, final, and synchronized.
4. It is used to initalize the instance variable of an object.
 */
package OOPS.constructors;

class Constructor
{
    /*Default Constructor 
    The main Purpose of Default constructor is if our instance var.is not initialized the default constructor automatically initialized with some default values.
    ex: for int it gives default value : 0 and for string it gives : Null 
    */
    public Constructor()
    {
    System.out.println("constructor called");
    }

    String name;
    int age; // instance variables
    // method
    // public void display()
    // {
        //     System.out.println("My age is: "+age); // it gives default values.
        //     System.out.println("My name is: "+name);
        // }

        Constructor(Constructor cons)
        {
            this.age = cons.age;
            this.name = cons.name;
        }
public void data()
{
    name = "chirag";
    age = 20; 
}
public void show()
{
    System.out.println("My name is: "+name);
    System.out.println("My age is: "+age); 
}

public static void main(String[] args)
{
        Constructor c = new Constructor();  //calling default constructor
        c.show(); // provide default values      
        c.data();  c.show(); // calling data() & show() method to print the intialized values.

        Constructor c1 = new Constructor(c);// copy constructor
        System.out.println("Copy Constructor example : "+c1.name);

        System.out.println("Parameterized Constructor : ");
        Param p = new Param(10); // calling parameterized constructor.

    }
}
class Param
{
    // Parameterized consturctor
Param(int x)
{
    System.out.println("The number is: "+x);
}
}


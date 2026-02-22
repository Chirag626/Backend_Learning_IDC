 package OOPS.inheritance;
// 
/*
 * Dynamic Method Dispatch ---> The method which has been implemented in the subclass is called and its code is executed.
 */

class Phone
{
    void show()
    {
        System.out.println("This is a phone ");
    }
    void on()
    {
        System.out.println("Phone is turning on");
    }
}
class Smartphone extends Phone
{
    void music()
    {
        System.out.println("Playing Music...");
    }
    void on()
    {
        System.out.println("Turning on Smartphone");
    }
}

public class DynamicMethod_Dispatch 
{
    public static void main(String[] args) 
    {
       // Smartphone s = new Phone();   Not Allowed

       //we can do this if our reference is of super class and object is of sub class then it is allowed but we can't do vice versa.
        Phone p = new Smartphone(); // Allowed
        p.show(); //allow 
        p.on(); // allow but this will call the sub class method not super class method.

        //      p.music(); // Not allowed because music() is not present/defined in Phone class.
     ((Smartphone) p).music(); // by using typecasting it will allow.
// But you should be careful when casting objects. 
// Make sure the object you are casting is actually of the correct type, otherwise, you might encounter ClassCastException.

    
/*In this example, p.show() and p.on() are allowed because show() is inherited from the superclass Phone and on() is overridden in the subclass Smartphone.
However, p.music() is not allowed because music() is a method defined only in the Smartphone class and not in the Phone class. 
To call music(), you would need to cast p to Smartphone type first:
*/
    }
}

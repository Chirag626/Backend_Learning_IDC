package OOPS.abstraction;
/*
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * it shows only essential things to the user and hides the internal details, 
 * for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.
 * 
 * There are two ways to achieve abstraction in java
 1.	Abstract class (0 to 100%)
 2.	Interface (100%)
 
 Abstract class in Java
 -----------------------
1. A class which is declared as abstract is known as an abstract class. 
2. An abstract class must be declared with an abstract keyword.
3. It can have abstract and non-abstract methods.
4. It cannot be instantiated directly, they serve as a blueprint for other classes.
5. It can have constructors and static methods also.
6. It can have final methods which will force the subclass not to change the body of the method.

example: abstract class A
{
		//Code
}
 
 
Note :
agar koi class abstract class ko inherit krti hai to abstract class ke andar jitne bhi abstract method hai unki body child class ke andar declared honi hi chahiye.otherwise error show hoga

2. Abstract Method ---->
A method which is declared as abstract and doesn't have body/implementation is known as an abstract method.
if a class has an abstract method then the class should be declared abstract as well.

example : abstract void show(); //agar kisi class me abstract method hai to wo class bhi abstract honi chahiye.
 */
 

 abstract class Shapes
 {
   protected static double pi;
  // protected final static double Pi = 3.14f;  //this is also valid 

   // parameterized constructor
   protected  Shapes(double pi)
   {
    this.pi = pi;
   }

   //Abstract Method
   public abstract  void Area();
   
   //Normal Method
   public void show()
   {
    System.out.println("we can also create normal method in abstract class");
   }
 }

 class Circle extends Shapes
 {
    private int radius;

    
    public Circle(int radius,double pi)
    {
        super(3.14); // super(pi); to call the super class constructor and provide the value.
        this.radius = radius;
    }
    public void Area()
    {
        System.out.println("Area of Circle : "+pi*(radius*radius));
    }
 }

 class Rectangle extends Shapes
 {
    private int length;
    private int breadth;
    
    Rectangle(int length,int breadth)
    {
        super(3.14); // super(pi);  to call the super class constructor and provide the value to the Shepes class.
        this.length = length;
        this.breadth = breadth;
    }
    public void Area()
    {
        System.out.println("Area of Rectangle : "+length*breadth);
    }
 }
 class Triangle extends Shapes
 {
    private double length;
    private double breadth;

    public Triangle(int l ,int b)
    {
        super(3.14); // super(pi);  to call the super class constructor and provide the value to the shapes (Superclass)
        length = l;
        breadth = b;
    }
    public void Area()
    {
        System.out.println("Area of Triangle is: "+(length*breadth)/2);
    }
 }
public class Abstraction
 {
    public static void main(String[] args)
     {
         Rectangle r = new Rectangle(4, 5);
         Triangle t = new Triangle(6, 7);
         

         // c.Area();
         r.Area();
         t.Area();
         
         //Shapes.pi = 3.14;  we can set the value here also
         // Circle c = new Circle(5,Shapes.pi);
         //or Shapes s = new Circle(5);   pi will provide by super(3.14);
        Shapes s = new Circle(5,3.14);
        s.Area();
        s.show();
    }
}

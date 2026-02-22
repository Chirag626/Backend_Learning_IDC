 package OOPS.inheritance;
// 
/*
Super Keyword --> We can use to access the super/parent class Members,It can be used in 3 ways :

1. To call the super/parent class variable ----->

* Whenever parent/super class variable and child class variable name both are same if we create an object for Subclass/child
  then the child class will provide more priority to its own class variable.
* If we want to invoke the super class variable then we should use "super" keyword.
* Super Keyword always refers to its immdeiate super class. 
* we should use super keyword when the super class member name and sub class member name both are same.

2. To call the super class method ----->

* Whenever super class method and sub class method both are same and if we create an object for the sub class
  then By Default it will invoke or call the sub class method, if we want to call  the super class method
  then we should use super keyword.
   
3. To call the super class constructor.

* The First line of any Constructor is reserved for Super() Keyword.
* super() --> to call the No-argument of Default constructor of super class .
* In the first line of any Constructor if we don't specify either super() or this() then the compiler
  will automatically add super() to the first line of constructor.
* The main purpose of this super(), to call the no argument or default constructor of the Super Class.

*/ 
//This Example for 1st property(same variables) :

class Father
{
	double balance = 10000 ;
	
	public Father()
	{
		System.out.println("Mera Paisa: " +balance);
	}
//	public double showBalance()
//	{
//		return balance;
//	}
}

class Son extends Father
{
	double balance = 5000;
	
	public Son()
	{		
		//This statement prefer his (Son)class (balance)variable if we aren't using Super keyword.
		System.out.println("Son balance: "+balance);
		//This statement print the Father class (balance)variable because of super keyword(super.balance);
		System.out.println("Father balance: "+super.balance); 
		
	}
}


// This Example for 2nd property (same Methods) :

class Super
{
	public void show()
	{
		System.out.println("This is Super/Parent Class Mehtod: ");
	}
}
class Sub extends Super
{
	public void show()
	{
		super.show();  // This will call super class method.
		
		System.out.println("This is Sub/Child Class Mehtod: ");
	}
}

// These example's for 3rd Property(constructors):

/*  Example 1 :
class A
{
	public A(){
		System.out.println("Class A no argument constructor");
	}
}
class B extends A
{
//here compiler will automatically add default constructor and super().
}
class C extends B
{
	public C()
	{
		System.out.println("Class C no argument constructor");
	}
}
*/

//Example 2
class A
{
	public A(int a){
		System.out.println("Class A there is an argument's constructor: "+a);
	}
}
class B extends A
{
	public B()
	{
		//super(); it shows an error because it'll find a no argument cons.. but in super class we create a parameterized constructor.
		super(100); // to avoid the error we will pass the parameters in super().
		System.out.println("Class B no argument constructor ");
	}
}

public class Super_keyword {
	
	public static void main(String[] args) 
	{ 
		//For 1st property
		// This object will call Father class properties only.
	// new Father(); //Anonymous or Nameless or Referenceless object. this will also work 
	
	//This object will call Son class and Father class property as well.
	Son s =new Son(); // we are storing our object in a Reference variable s.
//	System.out.println(s.showBalance());
 
 // for 2nd property
		Sub s1 = new Sub();
		s1.show();
	
// For 3rd Property
		// C c = new C(); // For Example 1

		B b = new B(); // For Example 2
 	}

}

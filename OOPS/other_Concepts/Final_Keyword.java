 package OOPS.other_Concepts;

/*
 * The final keyword in java is used to restrict the user. The java final keyword can be used in many context. 
 * Final can be used with: variable,method,class.
 * we can't declare constructor final because it can't be inherited.
 
 1. Final Variable.
 * we are making our value constant which is not changeable.
 
2. Final class

if we make our class final that means no one can inherit our propertics and not using our classes features in another class.
ex:
final class A
{
    show()
    {
        //code
    }
}
class B extends A{} //  here we can't inherit class A properties in class we stopped the inheritance.

3. Final Method 

if we want to stop Method Overriding so that no one can use our method we simply make our method final.
//Example for final method.

// class RealAuthor
// {
    //     final String Book_name = "Let Us C";
    //     String AuthorName = "YashwantKanetkar";

    //      final public void display() // no one can change this method and also our authorname.
    //    {
        //     System.out.println("BookName: "+Book_name+ "\n"+"Author: "+AuthorName);
        //    }
        // }
        // class FakeAuthor extends RealAuthor // fakeauthor can change the author name but if we create our method final it show an error.
        // {
            //     String AuthorName = "RajuRastogi";
            
            //     public void display()
            //     {
                //         System.out.println("BookName: "+Book_name+ "\n"+"Author: "+AuthorName);
                //     }
                // }
                
4. Blank Final variable.

* A final variable that is not initialized at the time of declaration is known as blank final variable.
If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed, it is useful. For example PAN CARD number of an employee.
* It can be initialized only in constructor.

example.
class Bike10{  
  final int speedlimit;//blank final variable  
    
  Bike10(){  
  speedlimit=70;  
  System.out.println(speedlimit);  
  }  
  
  public static void main(String args[]){  
    new Bike10();  
 }  
}  

output:- 70

5. static final blank variable :
A static final variable that is not initialized at the time of declaration is known as static blank final variable. 
It can be initialized only in static block.
ex: 
class A{  
  static final int data;//static blank final variable  
  static
  {
     data=50;
    }  
  public static void main(String args[]){  
    System.out.println(A.data);  
 }  
}  

6.final Parameter: If you declare any parameter as final, you cannot change the value of it.
ex:
class Bike11{  
  int cube(final int n){  
   n=n+2;//can't be changed as n is final  
   n*n*n;  
  }  
  public static void main(String args[]){  
    Bike11 b=new Bike11();  
    b.cube(5);  
 }  
}  

 */

// 7. When a non primitive is final, you cannot reassign it.
class A 
{
    String name;

    public A(String name)
    {
        this.name = name;
    }
}
public class Final_Keyword                
{
    public static void main(String[] args) 
    {
        final int num = 10;
     // num = 45; // it shows error bcz we set the value of num constant which is not changeable

     final A obj = new A("Chirag");// coz we have already assigned here..
     obj.name = "Aman";
     System.out.println(obj.name);
    //  obj = new A("Manav"); // we a non primitive("here A") is final so we can not reassign it.

    }
}
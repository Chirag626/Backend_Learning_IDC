 package OOPS.inheritance;
// 
class A1 
{
    public void show()
    {
        System.out.println("This is Parent A");
    }

}
class B1 extends A1
{
    public void show2()
    {
        System.out.println("This is Child B");
    }
}
public class upcasting_downcasting {
    public static void main(String[] args) 
    {
//Upcasting  child to parent we don't have to mention typecasting part it will work implicity/internally.
//We can access some specified methods of the child class.
       // A obj = (A) new B() ; 
       A1 obj = new B1(); // this will work properly there is not mandatory to mention type casting here.
       obj.show();   

//Downcasting: All the methods and variables of both classes can be accessed by performing downcasting.
       // B obj2 = obj; // Error
       B1 obj2 = (B1) obj; // Downcasting this will work only explicity if we want to do downcasting then it is mandatory to typecast.
       obj2.show2(); 
       obj2.show();
    }
}

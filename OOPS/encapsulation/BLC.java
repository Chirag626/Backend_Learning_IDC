 package OOPS.encapsulation;
// 
/* BLC --> /Business Logic Class is that type of class where we write or logics.
we can't declare this type of classes public.
// if we divide these classes it is an advantage for code Reusability. */
class BLC 
{
    int age;
    String name; //Instance variable

    public void data(int a, String n) // Local var. are  a&n
    {
        age = a;
        name  = n;
    }
    public void display()
    {
        System.out.println("The name is: "+name);
        System.out.println("Age : "+age);
    }
}

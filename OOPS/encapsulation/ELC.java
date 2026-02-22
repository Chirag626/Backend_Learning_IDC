 package OOPS.encapsulation;
// 
// ELC --> Executable Logic Class --> Only main(file_name) class can be public.

public class ELC 
{
    int x= 10;
    public static void main(String[] args) 
    {
     BLC boy = new BLC();
     boy.data(20, "RAM");
     boy.display(); 
     
     BLC girl = new BLC();
     girl.data(19,"SITA");
     girl.display();

     ELC e1 = new ELC();
     ELC e2 = new ELC();
// whenever we create an object in java, a separate copy of all the instance var. will be created.
    System.out.println(++e1.x);  //holds separate memory
    System.out.println(--e2.x);  //holds separate memory

    }
}

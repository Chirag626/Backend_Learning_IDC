package OOPS.constructors;
// 
class Person
{
    private String  username;
    private int password;

    public Person() //When user creates an constuctor with no arguments pass then it is called Non Parameterized or No Arguments Constructor.
    {
        username  = "Chirag";
        password = 123; 
    }
//Parameterized Constructor
    public Person(String username,int password)
    {
        this.username = username;
        this.password = password;
        System.out.println("Username: "+this.username+"\nPassword: "+this.password);
    }

    public String display()
    {
        return "Username : "+username +"\nPassword : "+password;
    }
}
public class parameterizedConstructor {
    public static void main(String[] args)
    {
        Person p1 = new Person();
        System.out.println(p1.display());

        Person p2 = new Person("Sumit", 118);
        Person p3 = new Person("Rianchal", 119);
    }
}

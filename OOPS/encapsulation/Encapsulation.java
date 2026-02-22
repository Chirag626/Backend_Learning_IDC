 package OOPS.encapsulation;

/* 
Encapsulation :- It is process to wrapping / binding of Data and Methods in a Single Unit.
It is used to provide Security.
Eg: class , Capsule.
Rules -->
1. Declare all your instance variable with private access modifier. if this happens then the class are "Tightly Encapsulated."
2. Define getters and setters to perform read and write operation.
 "Getter" method is used to return the value, while "Setter" is used to Modify the value.
*/

public class Encapsulation 
{
    private String Username; //achieving data hiding by the use of access modifiers.
    private int  password;

    public void setId(String Username) //Setter
    {
        this.Username = Username;
    }

    public String getId() //getter
    {
        return this.Username;
    }

    public void setpassword(int pass)
    {
        password = pass;
    }

    public int getpassword()
    {
        return password;
    }
    public static void main(String[] args) 
    {
      Encapsulation e = new Encapsulation();

      e.setId("Chirag");
      System.out.println("Username: "+e.getId());

      e.setpassword(1234);
      System.out.println("Password: "+e.getpassword());
    }
}

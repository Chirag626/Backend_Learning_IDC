package OOPS.constructors;

//Passing object reference to a parameterized constructor.
class Employee
{
    private int e_id;
    private String e_name;

    public void setEmployeeId(int e_id) // setter
    {
        this.e_id = e_id;
    }
    public int getEmployeeId() //getter
    {
        return this.e_id;
    }
    public void setEmployeeName(String e_name)
    {
        this.e_name = e_name;
    }
    public String getEmployeeName()
    {
        return this.e_name;
    } 
}

class Manager
{
    private int M_id;
    private String M_name;

    public Manager(Employee e) // here we pass the object(e.Employee) as a parameterized constructor of an Employee class which contains all properties of Employee class.
    {
        M_id = e.getEmployeeId(); // And access the properties via getter method/Methods.
        M_name = e.getEmployeeName(); 
    }
// in Java "toString" Method is used to print the properties of objects and when we use this method there is no need to write another method to display/print the properties.
    public String toString() {
        return "Manager [M_id=" + M_id + ", M_name=" + M_name + "]";
    }

    
   /*
   public void display()
   {
       System.out.println("Manager id : "+M_id);
       System.out.println("Manager Name : "+M_name);
    }
    */ 
}
public class CopyCons_ObjectReference 
{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployeeId(1);
        e1.setEmployeeName("CHIRAG");

        Manager m = new Manager(e1); // e = e1
       // m.display();  // this works when we want to accessing any method which will be created by the user.

       System.out.println(m); // this works when we are using "toString" Method.
    }    
}

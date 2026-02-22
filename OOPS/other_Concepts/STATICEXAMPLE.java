 package OOPS.other_Concepts;
// 
class Manager_M {
    static String Company_name;
    private int id;
    String department;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void show() {
        System.out.println(id + "," + Company_name + "," + department);
    }
}

class Employee_E extends Manager_M {
    // Employee inherits the Company_name and department variables from Manager
    String position;

    public void show()
    {
        super.show();
        System.out.print(","+position);

    }
}

class Employeee 
{
    private Manager_M emp;
    
    public void show (Manager_M emp)
    {
        
        System.out.print(emp.getId()+","+emp.Company_name+","+ emp.department);
    }
    
    
}

public class STATICEXAMPLE {
    public static void main(String[] args) 
    {
     Manager_M m1 = new Manager_M();

        //Called Static variable by class name
     Manager_M.Company_name = "Accenture";

        m1.setId(1);
        m1.getId();
        m1.department = "Management";
        m1.show();

        Employee_E e1 = new Employee_E();
        e1.department = "Development";
        e1.setId(2);
        e1.getId();
        e1.position = "Java Developer"; 
        e1.show();

        Employeee e = new Employeee();
        e.show(m1);// Employee can access Company_name and department through inheritance
    }
}

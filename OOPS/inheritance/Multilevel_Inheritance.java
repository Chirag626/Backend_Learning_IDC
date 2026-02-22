 package OOPS.inheritance;
// -------------------- PERSON CLASS --------------------
class Person1
{
    int age;        // instance variable for age
    String name;    // instance variable for name

    // Default constructor
    // Agar koi value pass nahi hoti to ye chalega
    Person1()
    {
        age = 19;
        name = "raju";
    }

    // Parameterized constructor
    // Jab object banate waqt values pass karte hain tab ye run hota hai
    public Person1(int age, String name) {
        this.age = age;      // current object ke age me value store
        this.name = name;    // current object ke name me value store
    }

    // Method to display person details
    void showPerson()
    {
        System.out.println("name " + name + "," + "age " + age);
    }
}


// -------------------- EMP CLASS (inherits Person) --------------------
class Emp1 extends Person1
{
    int id;        // employee id
    double sal;    // employee salary

    // Parameterized constructor of Emp
    public Emp1(String name, int age, int id, double sal) 
    {
        // Parent (Person) ka parameterized constructor call
        // IMPORTANT: ye line decide karti hai ki Person me kaunsi values set hongi
        super(age, name);

        this.id = id;     // current object ka id set
        this.sal = sal;   // current object ki salary set
    }

    // Method to display employee details
    void showEmp()
    {
        System.out.println("Employee ID: " + id + ", Salary: " + sal);
    }
}


// -------------------- MANAGER CLASS (inherits Emp) --------------------
class Manager1 extends Emp1
{
    int team;   // team size handled by manager

    // Parameterized constructor of Manager
    Manager1(String name, int age, int employeeId, double salary, int team) {

        // Emp ka constructor call hoga → phir Person ka
        // Constructor chain: Manager → Emp → Person
        super(name, age, employeeId, salary);

        this.team = team;   // manager ki team size set
    }

    // Method to display manager details
    void showManager() {
        System.out.println("Team Size Managed: " + team);
    }
}


// -------------------- MAIN CLASS --------------------
class Multilevel_Inheritance
{

    void main()
    {
        System.out.println("hello world");

        // Manager object create
        // Constructor execution order:
        // 1️⃣ Person(age, name)
        // 2️⃣ Emp(...)
        // 3️⃣ Manager(...)
        Manager1 m = new Manager1("Chirag", 18, 101, 5000, 2);

        // Person class ka method
        m.showPerson();

        // Emp class ka method
        m.showEmp();

        // Manager class ka method
        m.showManager();
    }
}


/*Association -->" HAS - A" RelationShip
Note :- if we define instance varialble of our college class then it shows an error so to avoid these types of error we can use
Getters and Setters but in this code we will using only getter method because here the consturtors sets the value if we r not used this then we use Setter to set the values.
*/
//Our code will look like this if we create our college class instance var. private
/* 
class College
{
    private String c_name;
    private String c_Location;

    public College(String c_name, String c_Location)
    {
        this.c_name = c_name;
        this.c_Location = c_Location;
    }

    public String getCollegeName()
    {
        return c_name;
    }
    public String getCollegeLocation()
    {
        return c_Location;
    }
}
    class Student
{
    private String s_name;
    private String s_rollnumber; 
    private College CollegeDetails; // where college is a class and collegedetails is a var. that stores the College class object.
  
    public Student(String s_name, String  s_rollnumber, College CollegeDetails)  // CollegeDetails = c1
    {
        this.s_name = s_name;
        this.s_rollnumber = s_rollnumber;
        this.CollegeDetails = CollegeDetails;
    }
    public void  displaySdata()
    {
        System.out.println("Student Name : "+ s_name );
        System.out.println("Student RollNo. : "+ s_rollnumber );
        System.out.println("College Name : "+ CollegeDetails.getCollegeName()); // access through methods
        System.out.println("Location : "+CollegeDetails.getCollegeLocation());
    }
}
*/
 package OOPS.other_Concepts;

class College
{
    String c_name;
    String c_Location;

    public College(String c_name, String c_Location)
    {
        this.c_name = c_name;
        this.c_Location = c_Location;
    }
}
class Student
{
    private String s_name;
    private String s_rollnumber; 
    private College CollegeDetails; // where college is a class and collegedetails is a var. that stores the College class object.
  
    public Student(String s_name, String  s_rollnumber, College CollegeDetails)  // CollegeDetails = c1
    {
        this.s_name = s_name;
        this.s_rollnumber = s_rollnumber;
        this.CollegeDetails = CollegeDetails;
    }
    public void  displaySdata()
    {
        System.out.println("Student Name : "+ s_name );
        System.out.println("Student RollNo. : "+ s_rollnumber );
        System.out.println("College Name : "+ CollegeDetails.c_name ); // Access through instance var. ex: c_name
        System.out.println("Location : "+CollegeDetails.c_Location);
    }
}

public class Association_HAS_A 
{
    public static void main(String[] args) 
    {
        College c1 = new College("ITM University", "Sithouli,Gwalior(M.P.)");
        Student s1 = new Student("Chirag", "D03", c1); // Here collegeDetails = c1;
        s1.displaySdata();
        Student s2 = new Student("Rianchal", "D11", c1); // Here collegeDetails = c1;
        s2.displaySdata();
        
    }
}

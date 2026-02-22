 package OOPS.other_Concepts;
/*
 * The Enum in Java is a data type which contains a fixed set of constants.
 * According to the Java naming conventions, we should have all constants in capital letters. So, we have enum constants in capital letters.
 * Java Enums can be thought of as classes which have a fixed set of constants (a variable that does not change). T
 * 
 * 
 * Enums are used to create our own data type like classes. 
 * The enum data type (also known as Enumerated Data Type) is used to define an enum in Java. 
 * Unlike C/C++, enum in Java is more powerful. Here, we can define an enum either inside the class or outside the class.
 * 
 * Java Enum internally inherits the Enum class,so it cannot inherit any other class.but it can implement many interfaces.
 * 
 **  Points to remember for Java Enum **
1. Enum improves type safety
2. Enum can be easily used in switch and if else.
3. Enum can be traversed.
4. Enum can have fields, constructors and methods(both abstract or non abstract).
5. Enum may implement many interfaces but cannot extend any class because it internally extends Enum class.
6. we can't create instance of enum , because it contains private constructors only.

some internal methods.
values(): Returns an array containing all the enum constants.
valueOf(): Converts a string to the corresponding enum constant.
ordinal(): Returns the position of the enum constant within its enum declaration, starting from zero.
 * 
 * 
 */

import java.util.Scanner;
enum Status
{
    Run("All Good"),Pending("Work in Progress"),Succes("Done"),Fail("Try Again");

    final String getstatus;
    Status(String getstatus)
    {
        this.getstatus = getstatus;
    }
}


enum Size
{
    XXl(42,"Kurta"), XL(40,"Shirt"), L(38,"T-Shirt"), M(36,"Trousers"),S(34,"Shorts");

    final int length;
    String item;

    Size(int length,String item) //Constructor
    {
        this. length = length;
        this.item = item;
    }

   public int getLength()
   {
    return length;
   }

   public String getItem()
   {
    return item;
   }
}

class Chutti
{
	private static  int num;
	Chutti(int n)
	{
		n = num;
	}
enum Week
{
	SUNDAY,Monday,Tuesday,Wednesday,Thursday,Friday,SATURDAY;

    // Method to get the next day of the week
    public Week  getNextDay()
    {
        // Get the index of the current day
        int currentday = this.ordinal();
        // Calculate the index of the next day
        int nextDay = (currentday + 1) % values().length;

        // Return the next day
        return values()[nextDay];
    }
    
	
}
		enum SpecialHolidays

		{
			Holi,Diwali;
			
		}
}

enum names
{
    CHIRAG,
    SUMIT,
    RIANCHAL,
    SAURAV,
    ANUJ,
    RUPESH;
}

public class Enums 
{
    public static void main(String[] args)
     {
        System.out.println("Example of enum Status");
        //Enum Status
        Status s = Status.Run;
        System.out.println(s);

        for(Status a : s.values())
        {
            System.out.println(a+": "+a.ordinal());
        }

        //Calling Constructor.
       //or  Status.Fail.getstatus = "OK"; // anyone can change the value if we are not declared our var. final
        System.out.println(Status.Fail.getstatus); // this print actual value bcz our getstatus var. is final.

        System.out.println("------------------------");
        
        //Size Enum
       System.out.println("Example of enum SIZE");
       for(Size size : Size.values())
       {
           System.out.println(size+" : "+size.length+" : "+size.item);
        }
        
        //or by using  methods.
        System.out.println("\nBy Using Methods:");
        Size size = Size.XL;
        System.out.println(size + " = "+size.getLength()+" ,"+size.getItem());
        System.out.println("------------------------");
        
        // Week Enum
        System.out.println("Example of enum Week");
        Chutti.Week s1 = Chutti.Week.Monday; 
        System.out.println("\nToday is "+s1);
        
        // Getting the next day
        Chutti. Week nextDay = s1.getNextDay();
        System.out.println("Next day is " + nextDay);
        
        //Get SpecialHolidays
        Chutti.SpecialHolidays [] s2 = Chutti.SpecialHolidays.values(); // .values() returns an array of all the enum values at once. 
        System.out.println(); //for next line.
        for(Chutti.SpecialHolidays s3 : s2)
        {
            System.out.println("Special Days: "+s3);
        }
        System.out.println("------------------------");
        

        System.out.println("Example enum names");
        // ENUM NAME
        // Example if else:
        names n = names.CHIRAG;
        System.out.println("\nWith Conditional Statements");
        if(n == names.CHIRAG)
        {
            System.out.println("This is "+names.CHIRAG);
        }
        else
        {
            System.out.println("This is not Chirag");
        }

        // Switch Case
        System.out.println("\nSwitch - Case Example");
        switch(n)
        {
            case SUMIT : 
            System.out.println("This is sumit");
            break;
            case RIANCHAL:
            System.out.println("This is rianchal");
            default:
            System.out.println("This is not sumit & Rianchal  ");
        }

        System.out.println("\nUsing ValueOf Method");

        // valueOf method
        Scanner sc = new Scanner (System.in);
        System.out.println("enter enum string: ");
        String str = sc.nextLine();

        try
        {
            names strconversion = names.valueOf(str); // valueOf() method is used to convert string into enum.
            System.out.println(strconversion+" is available in our enum so this is valid ");
            
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Enter valid String and it is not available in enum ");
        }
        System.out.println("------------------------");
    }
}

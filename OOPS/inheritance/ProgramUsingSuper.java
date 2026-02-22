 package OOPS.inheritance;
// 

class Shape
{
    protected int x;

    public Shape(int x)
    {
        this.x = x;
        System.out.println("The value of x is : "+x);
    }
}
class Square_sq extends Shape
{
    public Square_sq(int y)
    {
        super(y); // calling the super class parameterized constructor.

    }
    public void AreaofSquare()
    {
        System.out.println("The area of Square is: "+(x*x));
    }
}
class Rectangle_R extends Square_sq
{
    protected int b;
    public Rectangle_R(int l,int b) {
        super(l);
        this.b = b;
    }
    public void areaofRectangle()
    {
        System.out.println("The Area of Rectangle is: " +(x*b));
    }
}
public class ProgramUsingSuper
 {
    public static void main(String[] args) {
    
        /* 
        System.out.println("Choose the value : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Square s = new Square(num);
        s.AreaofSquare(); 
        */

        Square_sq s = new Square_sq(5);
        s.AreaofSquare();

        Rectangle_R r = new Rectangle_R(8, 5);
        r.areaofRectangle();
    }
}

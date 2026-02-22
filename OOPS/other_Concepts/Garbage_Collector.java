 package OOPS.other_Concepts;

class Gb
{

    public Gb() 
    {
        System.out.println("object is created");
    }

    @Override
    protected void finalize() throws Throwable { // just to check this method works or not...
        System.out.println("Object is destroyed");
    }    
}
public class Garbage_Collector 
{
  void main()
  {
    Gb obj;

    for(int i = 0; i<1000000000; i++)
    {
        obj = new Gb();
    }

  }
}

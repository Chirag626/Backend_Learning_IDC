 package OOPS.abstraction;

/*
 * Functional interface/SAM (Single Abstract Method)  is an interface in which we have only one abstract method. 
 * to use functional interface by simply using @FunctionalInterface annotation it shows error if we create more than one method.
 */
@FunctionalInterface
interface X
{
	abstract void show(); // public abstract by default added.
}

public class Functional_interface {

	public static void main(String[] args) 
	{
		// Normal  method
		X obj1 = new X()
		 {
			public void show()
			{
				System.out.println("This is a show Method for object  obj1 :)");
			}
		};
		obj1.show(); // calling show method.
		
						// OR
		
		// By using Lambda expression.
		X obj2 = () -> System.out.println("This is a show Method for object  obj2 :->");
		obj2.show();
	}

}

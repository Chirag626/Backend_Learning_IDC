 package OOPS.other_Concepts;
/*
 * Marker Interfaces: These interfaces do not declare any methods, but they are used to indicate a certain capability or feature of implementing classes.
 * 
 * Marker interfaces, often called tag interfaces, are interfaces without any methods declared. 
 * Simply said, they serve as markers, signalling that a class that implements the marker interface has particular properties or qualities. 
 * The Java runtime environment and other tools make use of these APIs to deliver extra functionality or data.
 *  Serializable, Cloneable, and Remote are some instances of marker interfaces in Java. 
 * Examples  the Serializable interface, which indicates that a class can be serialized, and the Cloneable interface, which indicates that a class can be cloned.
 * 
 * 
 * Serializable Interface:
   The Serializable interface in Java is a marker interface. It's used to indicate that a class can be serialized,
   meaning its objects can be converted into a stream of bytes that can be stored into a file or sent over a network. 

*  Cloneable Interface:
The Cloneable interface is another example of a marker interface in Java. 
It's used to indicate that a class implements the clone() method, which allows creating a copy of an object. 
However, Cloneable is somewhat controversial because it doesn't define the clone() method itself; 
it merely serves as an indicator that the class supports cloning.
Example:

// A class that implements Cloneable interface
class MyClass implements Cloneable {
    // Class implementation
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

Note: In the case of Cloneable, it's important to override the clone() method and throw CloneNotSupportedException because the clone() method is protected in Object class.
 */

 import java.io.Serializable;  
 // Marker Interface  in which no methods can be declared.
 interface MyMarkerInterface extends Serializable 
 {  

 }  
 public class MarkerInterfaceExample {  
     public static void main(String[] args) {  
         MyMarkerInterface obj = new MyMarkerInterface()
         {  
         };  
         System.out.println(obj instanceof Serializable); // true  
     }  
 }  

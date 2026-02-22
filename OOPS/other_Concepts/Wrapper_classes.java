 package OOPS.other_Concepts;
// 
/*
 * Wrapper Classes -> The wrapper class in Java provides the mechanism to convert primitivetype values into object and object into primitive.
 * Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. 
 * The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.
 * 
 * Use of Wrapper classes in Java
Java is an object-oriented programming language, so we need to deal with objects many times like in Collections, Serialization, Synchronization, etc. Let us see the different scenarios, where we need to use the wrapper classes.

Change the value in Method: Java supports only call by value. So, if we pass a primitive value, it will not change the original value. But, if we convert the primitive value in an object, it will change the original value.
1. Serialization: We need to convert the objects into streams to perform the serialization. If we have a primitive value, we can convert it in objects through the wrapper classes.
2. Synchronization: Java synchronization works with objects in Multithreading.
3. java.util package: The java.util package provides the utility classes to deal with objects.
4. Collection Framework: Java collection framework works with objects only. All classes of the collection framework (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects only.

The eight classes of the java.lang package are known as wrapper classes in Java. 
Boolean,Integer,Character,Float,Double,Byte,Short,Long.
 */


public class Wrapper_classes 
{
    public static void main(String[] args) 
    {
        int num = 10; // here we store a value in a variable
        //Integer is a wrapper class and num1 is an object.
        // Integer num1 = new Integer(num); it gives a warning. Integer(int) in Integer has been deprecated and marked for removal
        Integer num1 = num; // AutoBoxing  here we are storing our variable(num) in object(num1).
        System.out.println(num1);
        
        int num2 = num1; //auto Unboxing here we are storing object(num1) into a variable(num2).
        System.out.println(num2);  


        String str = "12";
        //System.out.println(str*10);  this line won't work we can't perform a operation between a string and an integer.
        
        // to get a int from a string there is a wrapper class Integer and in this class there is a method parseInt.
        int num3 = Integer.parseInt(str); // parseInt method converts the string or any type of data into an integer. 
        System.out.println("Convert string into int using parseIntmethod in Integer class: "+num3*10); //output : 120
        
    }    
}

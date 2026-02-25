package OOPS.other_Concepts;

// 1. Shallow Copy
// 2. Deep Copy
// 3. Cloneable interface usage

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Stdnt implements Cloneable {

    int id;
    String name;
    Address address;  // Reference type field

    Stdnt(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Overriding clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {

        // Step 1: Perform shallow copy
        Stdnt cloned = (Stdnt) super.clone();

        // Step 2: Convert shallow copy to deep copy
        // Create a new Address object instead of copying reference
        cloned.address = new Address(this.address.city);

        return cloned;
    }
}

public class ObjectCloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Creating original object
        Address address = new Address("Mumbai");
        Stdnt original = new Stdnt(101, "Chirag", address);

        // Cloning the object
        Stdnt cloned = (Stdnt) original.clone();

        // Display before modification
        System.out.println("Before modification:");
        System.out.println("Original City: " + original.address.city);
        System.out.println("Cloned City: " + cloned.address.city);

        // Modify cloned object's address
        cloned.address.city = "Delhi";

        // Display after modification
        System.out.println("\nAfter modification:");
        System.out.println("Original City: " + original.address.city);
        System.out.println("Cloned City: " + cloned.address.city);
    }
}
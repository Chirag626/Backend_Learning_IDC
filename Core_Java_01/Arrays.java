/*
Array : An array is a container that stores multiple values of the homogeneous(same) data type in a single variable.

Example : Instead of writing: int a1 = 10 , a2 = 20; a3 = 30;
          We write: int[] marks = {10, 20, 30};

✔ Saves memory
✔ Easy to manage
✔ Easy to loop through data.

# How Array Works in Memory : 
* Array stores values in continuous memory locations.
* Index always starts from 0.

index        value
0             10
1             20
2             30

Default values in array: 
| Data Type | Default Value |
| --------- | ------------- |
| int       | 0             |
| double    | 0.0           |
| boolean   | false         |
| String    | null          |


*/


package Core_Java_01;
public class Arrays 
{
    public static void main(String[] args) 
    {
        // Ways to create an Array.
    // 1. Direct Initialization 
    int [] arr1 = {10,20,30};

    // 2. Declare Size First
   int [] arr2 = new int[3]; 
   arr2[0] = 11;
   arr2[1] = 44;
   arr2[2] = 33;

   // Accessing elements :
   System.out.println("arr1 : "+arr1[0]); //to access first elementfrom arr.
   System.out.println("arr2 : "+arr2[1]); //to access second element from arr2.

   
    //❗Invalid index gives error:
    // System.out.println(arr[5]); // ArrayIndexOutOfBoundsException


    // Updating Array Value 
    arr2[1] = 22;
    System.out.println("Updated Value of arr2 : "+ arr2[1]);

    // Length of Array  : use .length not .length() coz it's a property not a method.
    System.out.println("length of arr2 : "+ arr2.length);


    // Traversing an Array using for Loop :
    System.out.print("Traversing arr1 using for Loop : ");
    for(int i = 0; i<arr1.length; i++)
    {
        System.out.print(arr1[i]+" ");
    }
    
    /* Traversing an Array using for-each loop:
    Use for-each when:
    - Only reading values
    - Index is not needed 
    */ 
    System.out.print("\nTraversing arr2 using for each loop : ");
    for(int a : arr2)
    {
        System.out.print(a + " ");
    }


    // 2D - Array
    int [][] matrix = {{1,2},{3,4,5}};
    // another way 
    int [][] matrix2 = new int[2][3];

    System.out.println("\n2D - array : "+matrix[0][1]); // prints 2 , 0th index ka second element.

    // accessing 2D array element using loop : 
    for(int i = 0; i < matrix.length; i++)
    {
        for(int j = 0; j < matrix[i].length; j++)
        {
            System.out.print(matrix[i][j] + " ");
        }
    }
    }
}

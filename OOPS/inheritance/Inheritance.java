 package OOPS.inheritance;

class Animals
{
    String animal;
    public void eat()
    {
        System.out.println(animal+" can eat");
    }

    public void walk()
    {
        System.out.println(animal + " can walk");
    }

 
}

class  Lion extends Animals
{
   
    Lion(String animal)
    {
        this.animal = animal;
    }
    public void roar()
    {
        System.out.println(this.animal + " roars");
    }

}

public class Inheritance
 {
    public static void main(String[] args) 
    {
        Lion l = new Lion("Lion");
        Lion l2 = new Lion("Dog");
        l.eat();
        l.roar();
        l.walk();

        l2.walk();
        l2.eat();
// 



/*
Upcasting --> A super class reference variable can hold the object of sub class.
   Ex-:  Animal a = new Lion();  // Valid where Animal is a super/parent class , a is reference var. and Lion is a child/sub class.

   // Down Casting -->
   child c = new Parent(); //Invalid 

 */

        //  Lion l1 = new Animals(); // Invalid by Downcasting we can't do downcasting

//         Lion l1 = (Lion)new Animals(); /* in this downcasting example we forcefully/typecasting karke call karne ka try kia toh 
// "Animals cannot be cast to class OOPS.Lion (OOPS.Animals and OOPS.Lion are in unnamed module of loader 'app')" exception aya.*/
//         l1.eat();
    }
}

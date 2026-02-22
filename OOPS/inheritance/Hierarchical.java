 package OOPS.inheritance;
// 
class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(species + " is eating");
    }

    public void sleep() {
        System.out.println(species + " is sleeping");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(breed + " dog is barking");
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String species, String color) {
        super(species);
        this.color = color;
    }

    public void meow() {
        System.out.println(color + " cat is meowing");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Dog myDog = new Dog("Dog", "Golden Retriever");
        Cat myCat = new Cat("Cat", "White");

        myDog.eat();
        myDog.sleep();
        myDog.bark();

        myCat.eat();
        myCat.sleep();
        myCat.meow();
    }
}

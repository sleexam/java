
// Base class (Parent class)
class Animal {
    // Constructor of the Animal class
    Animal() {
        System.out.println("An animal is created");
    }

    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Single Inheritance (Dog extends Animal)
class Dog extends Animal {
    // Constructor of Dog class
    Dog() {
        super(); // Calling the constructor of Animal class
        System.out.println("A dog is created");
    }

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Multi-level Inheritance (Puppy extends Dog)
class Puppy extends Dog {
    // Constructor of Puppy class
    Puppy() {
        super(); // Calling the constructor of Dog class
        System.out.println("A puppy is created");
    }

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Puppy whines");
    }
}

// Hierarchical Inheritance (Cat and Dog inherit from Animal)
class Cat extends Animal {
    // Constructor of Cat class
    Cat() {
        super(); // Calling the constructor of Animal class
        System.out.println("A cat is created");
    }

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate inheritance and dynamic method dispatch
public class inher {
    public static void main(String []args) {
        System.out.println("Single Inheritance Example:");
        Dog dog = new Dog();   // Dog class inherits Animal class
        dog.sound();           // Calls overridden method in Dog class

        System.out.println("\nMulti-level Inheritance Example:");
        Puppy puppy = new Puppy(); // Puppy class inherits Dog class, which inherits Animal class
        puppy.sound();             // Calls overridden method in Puppy class

        System.out.println("\nHierarchical Inheritance Example:");
        Animal animal1 = new Dog(); // Animal reference, but Dog object
        Animal animal2 = new Cat(); // Animal reference, but Cat object

        animal1.sound(); // Dynamic method dispatch: Calls Dog's sound() method
        animal2.sound(); // Dynamic method dispatch: Calls Cat's sound() method
    }
}


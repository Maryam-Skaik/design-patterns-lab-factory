package ZooSystem;

/**
 * Another concrete implementation of Animal.
 * 
 * Each class has its own behavior implementation.
 * This is polymorphism in action.
 */

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow");
    }
}

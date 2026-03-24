package ZooSystem;

import java.util.Scanner;

/**
 * Zoo class represents a part of the system that needs to create animals.
 * 
 * This is where we demonstrate the PROBLEM and the SOLUTION.
 */

public class Zoo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Animal Type: ");
        String type = s.next();

        /**
         * ============================
         * ❌ NAÏVE SOLUTION (Bad Design)
         * ============================
         * 
         * In the beginning, developers might write:
         * 
         * if(type.equalsIgnoreCase("dog")){
         *     animal = new Dog();
         * } else if(type.equalsIgnoreCase("cat")){
         *     animal = new Cat();
         * }
         * 
         * Problems:
         * - Repeated in multiple classes (Zoo, AnimalShow, etc.)
         * - Hard to maintain
         * - Adding new animal requires modifying many classes
         */

        /**
         * ============================
         * ✅ FACTORY SOLUTION (Good Design)
         * ============================
         * 
         * Instead of creating objects here,
         * we delegate this responsibility to a Factory class.
         */

        AnimalFactory factory = new AnimalFactory();

        // Zoo does NOT know how objects are created
        Animal animal = factory.createAnimal(type);

        // Zoo only uses the object
        animal.makeSound();
    }
}

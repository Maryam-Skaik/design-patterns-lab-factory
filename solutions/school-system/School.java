package SchoolSystem;

import java.util.Scanner;

/**
 * School represents one part
 * of the system that needs
 * to create students.
 * 
 * This class demonstrates
 * the problem and the solution.
 */

public class School {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student Type: ");
        String type = s.next();

        /**
         * ============================
         * NAÏVE SOLUTION (Bad Design)
         * ============================
         * 
         * if(type.equalsIgnoreCase("science")){
         *     student = new ScienceStudent();
         * }
         * 
         * Problems:
         * - Repeated logic
         * - Tight coupling
         * - Hard maintenance
         */

        /**
         * ============================
         * FACTORY SOLUTION
         * ============================
         * 
         * Object creation responsibility
         * is delegated to StudentFactory.
         */

        StudentFactory factory = new StudentFactory();

        // School does NOT know
        // how objects are created
        Student student = factory.createStudent(type);

        // School only uses the object
        student.study();
    }
}

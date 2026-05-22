package SchoolSystem;

import java.util.Scanner;

/**
 * Teacher represents another
 * part of the system that needs
 * to create students.
 * 
 * Important Teaching Point:
 * Multiple classes may need
 * the same creation logic.
 * 
 * Without Factory:
 * - Repeated if-else logic
 * 
 * With Factory:
 * - Reusable centralized logic
 */

public class Teacher {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student Type: ");
        String type = s.next();

        /**
         * Notice:
         * We are using
         * the SAME factory again.
         */

        StudentFactory factory = new StudentFactory();

        Student student = factory.createStudent(type);

        student.study();
    }
}

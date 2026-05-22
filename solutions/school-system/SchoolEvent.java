package SchoolSystem;

import java.util.Scanner;

/**
 * SchoolEvent represents another
 * system component that needs
 * to create students.
 * 
 * This demonstrates how multiple
 * classes can reuse the SAME factory.
 */

public class SchoolEvent {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student Type: ");
        String type = s.next();

        /**
         * Instead of duplicating
         * creation logic again,
         * we reuse StudentFactory.
         */

        StudentFactory factory = new StudentFactory();

        Student student = factory.createStudent(type);

        student.study();
    }
}

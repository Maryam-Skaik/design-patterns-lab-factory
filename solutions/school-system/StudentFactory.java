package SchoolSystem;

/**
 * StudentFactory is responsible ONLY
 * for creating Student objects.
 * 
 * Design Pattern:
 * Factory Pattern
 * 
 * Main Responsibility:
 * - Centralize object creation
 * - Avoid duplication
 * - Reduce coupling
 * 
 * UML Relationship:
 * StudentFactory - - - >
 * ScienceStudent / ArtStudent / SportsStudent
 * 
 * Important:
 * Factory USES these classes
 * but does not store them.
 */

public class StudentFactory {

    /**
     * Factory Method:
     * Creates objects based on input type
     */
    public Student createStudent(String type) {

        /**
         * Important Teaching Point:
         * We did NOT remove if-else.
         * 
         * We centralized it in ONE place.
         * 
         * Benefits:
         * - Cleaner system
         * - Easier maintenance
         * - Better scalability
         */

        if (type.equalsIgnoreCase("science")) {
            return new ScienceStudent();

        } else if (type.equalsIgnoreCase("art")) {
            return new ArtStudent();

        } else if (type.equalsIgnoreCase("sports")) {
            return new SportsStudent();

        } else {
            throw new IllegalArgumentException("Unknown Student Type");
        }
    }
}

package SchoolSystem;

/**
 * Concrete implementation of Student.
 * 
 * This class represents
 * a Science Student.
 * 
 * UML Concept:
 * ScienceStudent implements Student
 * (Realization Relationship)
 */

public class ScienceStudent implements Student {

    @Override
    public void study() {
        System.out.println("Science Student studies Physics and Chemistry.");
    }
}

package SchoolSystem;

/**
 * Scenario:
 * We are building a School System
 * that contains different student types.
 * 
 * Design Idea:
 * Instead of creating unrelated classes,
 * we define a common abstraction.
 * 
 * UML Concept:
 * This represents an INTERFACE.
 * 
 * Later, classes like ScienceStudent,
 * ArtStudent, and SportsStudent
 * will implement it.
 */

public interface Student {

    /**
     * Every student type must define
     * its own study behavior.
     */
    public void study();
}

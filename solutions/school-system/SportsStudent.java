package SchoolSystem;

/**
 * Another concrete implementation
 * of Student.
 * 
 * This class represents
 * a Sports Student.
 */

public class SportsStudent implements Student {

    @Override
    public void study() {
        System.out.println("Sports Student practices Football and Fitness.");
    }
}

package bSchoolSystem;

public class StudentFactory {
    
    public Student createStudent(String type) {
        
        if (type == null) return null;

        if (type.equalsIgnoreCase("IT")) {
            return new ItStudent();
        } else if (type.equalsIgnoreCase("EDU")) {
            return new EduStudent();
        } else {
            throw new IllegalArgumentException("Unknown Student Type");
        }
    }
    
}

package SchoolSystem;

import SchoolSystem.Students.CurrentStudent;
import SchoolSystem.Students.GraduateStudent;



public class Teacher {

    public void teacher(String type) {
        Student student = Factory.CreatStudent(type);
        if (student instanceof CurrentStudent) {
            System.out.println("Still  learning");
        } else if (student instanceof GraduateStudent) {
            System.out.println("Finished learning");
        }
    }

}

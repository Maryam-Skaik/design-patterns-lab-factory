package SchoolSystem;

import SchoolSystem.Students.CurrentStudent;
import SchoolSystem.Students.GraduateStudent;


public class schoolEvant {

    public void addSchoolEvent(String type) {
        Student student = Factory.CreatStudent(type);   
        if (student instanceof CurrentStudent) {          // استخدام instance of لمعرفة نوع الطالب المرجع
            System.out.println("Can Join the event");
            student.type();
        } else if (student instanceof GraduateStudent) {
            System.out.println("Cannot join the event");
            student.type();
        }
    }

}

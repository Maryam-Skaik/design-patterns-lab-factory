package SchoolSystem;


import SchoolSystem.Students.CurrentStudent;
import SchoolSystem.Students.GraduateStudent;

public class School{
    
    public void school(String type){
        Student student = Factory.CreatStudent(type);
        if(student instanceof CurrentStudent){
            System.out.println("Still in School");
        }else if(student instanceof GraduateStudent){
            System.out.println("Finished School");
        }
    }
    

} 
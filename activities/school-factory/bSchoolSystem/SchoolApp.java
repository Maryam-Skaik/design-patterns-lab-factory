package bSchoolSystem;

import java.util.Scanner;

public class SchoolApp {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
//        System.out.println("Enter Your Department: ");
//        String type = s.next();
        
        StudentFactory stuFactory = new StudentFactory();
        
        Student studnet = stuFactory.createStudent("It");
        studnet.displayInfo();
    }
}

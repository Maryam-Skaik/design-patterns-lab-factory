package SchoolSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Factory {

    public static Student CreatStudent(String studentType) {
        try {   // كل مضيف نوع جديد على stuednt بس هصير اكتب اسم الكلاس و هو ينشأ الاوبجيكت
            return (Student) Class.forName("SchoolSystem.Students." + studentType).newInstance();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}

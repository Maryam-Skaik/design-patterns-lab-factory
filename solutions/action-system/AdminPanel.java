package ActionSystem;

import java.util.Scanner;

/**
 * Another part of the application
 * that also needs actions.
 * 
 * Multiple classes may need
 * the same object creation logic.
 * 
 * Without Factory:
 * - if-else duplication everywhere
 * 
 * With Factory:
 * - Reusable centralized creation logic
 */

public class AdminPanel {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Action Type: ");
        String type = s.next();

        /**
         * Notice:
         * We are reusing
         * the SAME factory.
         */

        ActionFactory factory = new ActionFactory();

        Action action = factory.createAction(type);

        action.execute();
    }
}

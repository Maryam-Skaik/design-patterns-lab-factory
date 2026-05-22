package ActionSystem;

import java.util.Scanner;

/**
 * BackendSystem simulates
 * one part of the application.
 * 
 * This class needs to create actions.
 * 
 * Without Factory:
 * - Action creation logic would
 *   be duplicated here.
 * 
 * With Factory:
 * - We delegate creation responsibility
 *   to ActionFactory.
 */

public class BackendSystem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Action Type: ");
        String type = s.next();

        /**
         * ============================
         * NAÏVE SOLUTION (Bad Design)
         * ============================
         * 
         * if(type.equalsIgnoreCase("payment")){
         *     action = new PaymentAction();
         * }
         * 
         * Problems:
         * - Repeated logic
         * - Tight coupling
         * - Hard maintenance
         */

        /**
         * ============================
         * FACTORY SOLUTION
         * ============================
         * 
         * Object creation is delegated
         * to the Factory.
         */

        ActionFactory factory = new ActionFactory();

        // BackendSystem does NOT know
        // how objects are created
        Action action = factory.createAction(type);

        // BackendSystem only uses the object
        action.execute();
    }
}

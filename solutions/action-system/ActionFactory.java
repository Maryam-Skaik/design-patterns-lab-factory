package ActionSystem;

/**
 * ActionFactory is responsible ONLY
 * for creating Action objects.
 * 
 * Design Pattern:
 * Factory Pattern
 * 
 * Main Responsibility:
 * - Centralize object creation
 * - Avoid duplication
 * - Reduce coupling
 * 
 * UML Relationship:
 * ActionFactory - - - >
 * PaymentAction / OrderAction / SupportAction
 * 
 * Important:
 * Factory USES these classes
 * but does not store them.
 */

public class ActionFactory {

    /**
     * Factory Method:
     * Creates objects based on input type
     */
    public Action createAction(String type) {

        /**
         * Important Teaching Point:
         * We did NOT remove if-else.
         * 
         * We centralized it in ONE place.
         * 
         * Benefits:
         * - Cleaner system
         * - Easier maintenance
         * - Better scalability
         */

        if (type.equalsIgnoreCase("payment")) {
            return new PaymentAction();

        } else if (type.equalsIgnoreCase("order")) {
            return new OrderAction();

        } else if (type.equalsIgnoreCase("support")) {
            return new SupportAction();

        } else {
            throw new IllegalArgumentException("Unknown Action Type");
        }
    }
}

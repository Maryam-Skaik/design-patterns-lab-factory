package ActionSystem;

/**
 * Scenario:
 * We are building a backend Action Processing System.
 * Different user actions exist in the system.
 * 
 * Examples:
 * - Payment submission
 * - Order placement
 * - Support request
 * 
 * Design Idea:
 * Instead of writing unrelated classes,
 * we define a common abstraction.
 * 
 * UML Concept:
 * This represents an INTERFACE.
 * 
 * Later, classes like PaymentAction,
 * OrderAction, and SupportAction
 * will implement it.
 */

public interface Action {

    /**
     * Every action must define
     * how it gets processed.
     */
    public void execute();
}

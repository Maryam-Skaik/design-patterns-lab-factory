package ActionSystem;

/**
 * Concrete implementation of Action.
 * 
 * This class represents a payment process.
 * 
 * UML Concept:
 * PaymentAction implements Action
 * (Realization Relationship)
 */

public class PaymentAction implements Action {

    @Override
    public void execute() {
        System.out.println("Processing Payment...");
    }
}

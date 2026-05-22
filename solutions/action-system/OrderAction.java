package ActionSystem;

/**
 * Another concrete implementation of Action.
 * 
 * This class represents placing an order.
 */

public class OrderAction implements Action {

    @Override
    public void execute() {
        System.out.println("Placing Order...");
    }
}

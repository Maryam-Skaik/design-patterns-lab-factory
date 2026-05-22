package ActionSystem;

/**
 * Another concrete implementation of Action.
 * 
 * This class represents sending
 * a support request.
 */

public class SupportAction implements Action {

    @Override
    public void execute() {
        System.out.println("Sending Support Request...");
    }
}

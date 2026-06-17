package bUserAction;

public class ActionFactory {
    public UserAction createAction(String actionType) {
        
        if (actionType == null) return null;

        if (actionType.equalsIgnoreCase("PAYMENT")) {
            return new Payment();
        } else if (actionType.equalsIgnoreCase("ORDER")) {
            return new Order();
        } else if (actionType.equalsIgnoreCase("SUPPORT")) {
            return new SupportRequest();
        } else {
            throw new IllegalArgumentException("Unknown Action Type: " + actionType);
        }
    }
    
}

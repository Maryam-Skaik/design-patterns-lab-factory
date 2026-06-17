package bUserAction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
//        System.out.println("Enter Your Action Method: ");
//        String type = s.next();
        
        ActionFactory actionFactory = new ActionFactory();
        
        UserAction action = actionFactory.createAction("payment");
        action.userActionMethod();
        
    }
}

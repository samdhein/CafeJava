public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.75;
        double latte = 9.50;
        double cappuccino = 9.50;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;


        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        
        // Cindhuri ordered a coffee. Print her status message based on her order status. 
        if(isReadyOrder1){
            System.out.println(customer1+"'s coffee is ready." );
        }else{
            System.out.println(customer1+"'s coffee is not ready.");
        }

        // Noah ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready,
        // also print the message to display the total. Outcomes may be different depending on the status. 
        if(isReadyOrder4){
            System.out.println(customer4+"'s cappuccino is ready.");
            System.out.println(String.format("%s's total is: $%.2f", customer4, cappuccino));

        }else{
            System.out.println(customer4+"'s cappuccino is not ready.");
        }
        // Sam: 2 lattes, print total, print approrpiate order status message
        System.out.println(String.format("%s's two lattes cost $%.2f", customer2, latte*2));
        if(isReadyOrder2){
            System.out.println(customer2+"'s lattes are ready.");

        }else{
            System.out.println(customer2+"'s lattes are not ready.");
        }

        // Jimmy was undercharged... he paid for a coffee but ordered a latte

        System.out.println(String.format("%s was undercharged by $%.2f", customer3, (latte - dripCoffee)));
    }
}

import java.util.Scanner;

public class JavaCraps {
    public static void main(String[] args) {
        
        // TODO 1: Object Creation 
        // Instantiate a new Scanner object named 'input' to read from System.in
        
        
        boolean keepPlaying = true;
        System.out.println("🎲 Welcome to Street Craps! 🎲");
        
        // Main game loop
        while (keepPlaying) {
            System.out.println("\n--- NEW ROUND ---");
            System.out.println("Press Enter to roll the Come Out roll...");
            input.nextLine();
            
            // TODO 2: Static Math Class
            // Use Math.random() to simulate rolling two 6-sided dice.
            // Remember Math.random() returns a double from 0.0 to 0.999... 
            // You must cast it to an (int) and shift the range to 1-6.
            
            
            int comeOutRoll = 7;
            System.out.println("You rolled a " + comeOutRoll);
            
            // TODO 3: If / Else If Statements
            // Write the logic to check for a Pass (7 or 11) or a Crap (2, 3, or 12)
            if (comeOutRoll == 7 || comeOutRoll == 11) {
                System.out.println("Pass! You win the come out roll!");
            } 
            else if (comeOutRoll == 2 || comeOutRoll == 3 || comeOutRoll == 12) {
                System.out.println("Craps! You lose.");
            } 
            else {
                // If it's not a win or loss, it becomes the Point
                int point = comeOutRoll;
                System.out.println("The Point is now: " + point);
                
                int currentRoll = 0;
                
                // TODO 4: De Morgan's Law
                // Write a while loop condition that continues rolling as long as:
                // currentRoll is NOT the point AND currentRoll is NOT 7.
                // HINT: Use De Morgan's Law format: !(a || b) instead of (!a && !b)
                boolean dcondition = ??;//Treat this as an if statement
                while (dcondition) {
                    System.out.println("Press Enter to roll for the point...");
                    input.nextLine(); 
                    
                    die1 = (int)(Math.random() * 6) + 1;
                    die2 = (int)(Math.random() * 6) + 1;
                    currentRoll = die1 + die2;
                    
                    System.out.println("You rolled a " + currentRoll);
                }
                
                // Check why the loop stopped to determine win or loss
                if (currentRoll == point) {
                    System.out.println("You hit the point! You win!");
                } else {
                    System.out.println("7 Out! You lose.");
                }
            }
            
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = input.nextLine();
            
            // TODO 5: String .equals() method
            // We cannot use == to compare Strings in Java because they are Objects.
            // Update the condition below to check if 'response' equals "yes".
            if (missingSomthinghere) {
                keepPlaying = true;
            } else {
                keepPlaying = false;
                System.out.println("Thanks for playing!");
            }
        }
        
        input.close();
    }
}
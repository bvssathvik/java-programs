import java.util.Scanner; // Import Scanner class to take user input

// Class to calculate the factorial of a number
public class factorial {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); // Creating Scanner object for user input

        // Prompting the user to enter a number
        System.out.println("Enter the number:");  
        int a = scanner.nextInt(); // Read the number into variable 'a'

        int factorial = 1; // Initializing factorial variable with 1

        // Loop to calculate factorial
        for (int i = 1; i <= a; i++) {  
            factorial = i * factorial; // Multiplying i with factorial
        }  

        // Output the result
        System.out.println("The factorial of " + a + " is: " + factorial);  

        scanner.close(); // Closing the Scanner object to prevent memory leaks
    }  
}  

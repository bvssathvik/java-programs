import java.util.Scanner; // Importing Scanner class to take user input

// Class to calculate Simple Interest
public class si {  
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in); // Creating Scanner object for user input

        // Asking the user to enter the principal amount
        System.out.println("Enter the principal: ");  
        float p = s.nextFloat(); // Reading the principal amount

        // Asking the user to enter the rate of interest
        System.out.println("Enter the Rate of interest: ");  
        float r = s.nextFloat(); // Reading the rate of interest

        // Asking the user to enter the time period
        System.out.println("Enter the Time period:");  
        float t = s.nextFloat(); // Reading the time period

        // Calculating Simple Interest using the formula: SI = (P * R * T) / 100
        float SI = (p * r * t) / 100;  

        // Printing the calculated Simple Interest
        System.out.println("Simple Interest is: " + SI);  

        
    }  
}  

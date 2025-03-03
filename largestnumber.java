import java.util.Scanner; // Importing Scanner class to take user input

// Class to find the largest number among three numbers
public class largestnumber {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); // Creating Scanner object for user input

        // Asking the user to enter the first number
        System.out.print("Enter first number: ");  
        int a = scanner.nextInt(); // Reading the first number

        // Asking the user to enter the second number
        System.out.print("Enter second number: ");  
        int b = scanner.nextInt(); // Reading the second number

        // Asking the user to enter the third number
        System.out.print("Enter third number: ");  
        int c = scanner.nextInt(); // Reading the third number

        // Using ternary operator to find the largest number
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);  

        // Printing the largest number
        System.out.println("The largest number is: " + largest);  

        scanner.close(); // Closing the Scanner object to prevent memory leaks
    }  
}  

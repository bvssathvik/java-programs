import java.util.Scanner; // Importing Scanner class to take user input

// Class to convert Fahrenheit to Celsius
class ftoc {  
    public static void main(String args[]) {  
        Scanner s = new Scanner(System.in); // Creating Scanner object for user input

        // Asking the user to enter temperature in Fahrenheit
        System.out.println("Enter the value of Fahrenheit: ");  

        float f = s.nextFloat(); // Reading the user input as float (Fahrenheit temperature)

        // Converting Fahrenheit to Celsius using the formula: C = (F - 32) * 5/9
        float c = (f - 32) * 5 / 9;  

        // Printing the converted Celsius value
        System.out.println("The value in Celsius is: " + c);  

        
    }  
}  

import java.util.Scanner;  // Importing Scanner class for user input

class ctof  // Class to convert Celsius to Fahrenheit
{
    public static void main(String args[]) {  
        Scanner s = new Scanner(System.in);  // Creating Scanner object for input
        
        System.out.println("Enter the value of Celsius");  // Prompting user for input
        float c = s.nextFloat();  // Reading the float value (Celsius)
        
        float f = (c * 9 / 5) + 32;  // Formula to convert Celsius to Fahrenheit
        
        System.out.println("The value of Fahrenheit is " + f);  // Printing the result
        
        
    }
}

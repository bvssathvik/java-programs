// Importing Scanner class from java.util package for user input
import java.util.Scanner;  


class rectanglearea {  
    public static void main(String args[]) {  
        // Creating Scanner object for taking user input
        Scanner s = new Scanner(System.in);  

        // Prompting the user to enter the length of the rectangle
        System.out.println("Enter the length of the rectangle ");  
        int length = s.nextInt();  // Reading integer input for length  

        // Prompting the user to enter the breadth of the rectangle
        System.out.println("Enter the breadth of the rectangle ");  
        int breadth = s.nextInt();  // Reading integer input for breadth  

        // Calculating the area of the rectangle
        int area = length * breadth;  

        // Displaying the area of the rectangle
        System.out.println("Area of rectangle: " + area);  
    }  
}  

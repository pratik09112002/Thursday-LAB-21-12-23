/*
Q)WAP to create a mini calculator ask the user what operation the user wants to perform, 
and repeat the task till the user wants to perform any operation.
*/


package Thursday_LAB;

import java.util.Scanner;
public class Mini_Calci 
{
    public static void main(String[] args) 
    {
    	char ans;
        Scanner sc = new Scanner(System.in);
        
       do 	
        {
	            // Display menu
	            System.out.println("Mini Calculator Menu:");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");
	
	            // Get user choice
	            System.out.print("Enter your choice (1-5): ");
	            int choice = sc.nextInt();
	
	            // Perform calculation based on user choice
	            switch (choice) 
	            {
	                case 1:
	                    Addition();
	                    break;
	                case 2:
	                    Subtraction();
	                    break;
	                case 3:
	                    Multiplication();
	                    break;
	                case 4:
	                    Division();
	                    break;
	                case 5:
	                    System.out.println("Exiting Mini Calculator. Goodbye!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	            }

            // Ask the user if they want to continue
            System.out.println("Do you want to Perform Another Operation Y/N");
			ans=sc.next().charAt(0);    
        }while(ans=='Y'||ans=='y');
       System.out.println("Thank You");

        // Close the scanner
        sc.close();
    }

    private static void Addition() // Addition Function
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Result: " + (num1 + num2));
    }

    private static void Subtraction() // Substraction Function
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 - num2));
    }

    private static void Multiplication() // Multiplication Function
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 * num2));
    }

    private static void Division() // Division Function
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0)
        {
            System.out.println("Result: " + (dividend / divisor));
        } 
        else 
        {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
        }
    }
}

/*
 Q)Design a class named ShowRoom with the following description: Instance variables/data members:
String name: to store the name of the customer.
 long mobno: to store the mobile number of the customer.
double cost: to store the cost of the items purchased. double dis: to store the discount amount.
double amount: to store the amount to be paid after discount.
Member methods:
 ShowRoom(): default constructor to initialize data members.
void input(): to input customer name, mobile number, cost.

void calculate(): to calculate discount on the cost of purchased items, based on the following criteria:

COST                                                         DISCOUNT (IN PERCENTAGE) <=to Rs. 10000                                                5%

> Rs. 10000 <=Rs. 20000                             10%

> Rs. 20000 <= Rs. 35000                           15%

> Rs. 35000 20%

 void display(): to display customer name, mobile number, amount to be paid after discount.
 Write a main() method to create an object of the class and call the above member methods.
 */

package Thursday_LAB;

import java.util.Scanner;

class Showroom 
{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

    // Default constructor
    Showroom() 
    {
        name = "";
        mobno = 0;
        cost = 0;
        dis = 0;
        amount = 0;
    }

    // Method to input customer details
    void input() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name:");
        name = scanner.nextLine();

        System.out.println("Enter mobile number:");
        mobno = scanner.nextLong();

        System.out.println("Enter cost of items purchased:");
        cost = scanner.nextDouble();
    }

    // Method to calculate discount based on cost
    void calculate() 
    {
        if (cost <= 10000) 
        {
            dis = cost * 0.05; // 5% discount
        } else if (cost <= 20000) 
        {
            dis = cost * 0.1; // 10% discount
        } else if (cost <= 35000) 
        {
            dis = cost * 0.15; // 15% discount
        } else {
            dis = cost * 0.2; // 20% discount
        }

        amount = cost - dis;
    }

    // Method to display customer details and amount after discount
    void display() 
    {
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Amount to be paid after discount: $" + amount);
    }

    public static void main(String[] args) 
    {
        // Creating an object of the ShowRoom class
        Showroom customer = new Showroom();

        // Calling member methods
        customer.input();
        customer.calculate();
        customer.display();
    }
}

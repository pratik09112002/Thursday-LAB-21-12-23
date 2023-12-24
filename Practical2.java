
/*
Q4)Create an interface called "BankAccount" with methods called "deposit" and "withdraw". Create a class called "CheckingAccount" that implements the BankAccount interface and implements the "deposit" and "withdraw" methods. 
Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
1.Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". 
Create an object of the Car class and call both the "drive" and "honk" methods.
*/
 package Thursday_LAB;
 
import java.util.*;

//BankAccount interface
interface BankAccount 
{
	void deposit();
	void withdraw();
}

//CheckingAccount class implementing BankAccount interface
class CheckingAccount implements BankAccount 
{
	 private double amount;
	 Scanner sc = new Scanner(System.in);
	 private double balance;
	 public CheckingAccount() 
	 {
	     this.balance = 0;
	 }

@Override
public void deposit() 
{
	 System.out.println("Enter Amount you want to Deposite : ");
	 amount=sc.nextDouble();
    balance += amount;
    System.out.println("Deposited: $" + amount);
}

@Override
public void withdraw() 
{
	 System.out.println("Enter Amount you want to Withdraw : ");
	 Scanner sc = new Scanner(System.in);
	 amount=sc.nextDouble();
    if (balance >= amount) 
	     {
	         balance -= amount;
	         System.out.println("Withdrawn: $" + amount);
	     } 
    else 
    {
        System.out.println("Insufficient funds");
    }
}
}

//Vehicle class
class Vehicle 
{
	 String brand,model;
	 int year;
	Scanner sc = new Scanner(System.in);
	public void vehicle()
	{
		System.out.println("Enter Brand of Car: ");
		brand=sc.nextLine();
		System.out.println("Enter Car Model: ");
		brand=sc.nextLine();
		System.out.println("Enter The year: ");
		year=sc.nextInt();
		System.out.println("Car Brand is: "+brand);
		System.out.println("Car Model is: "+model);
		System.out.println("Car Year is: "+year);
	}

public void drive() 
	 {
	     System.out.println("Vehicle is being driven.");
	 }
}

//Car class inheriting from Vehicle
class Car extends Vehicle 
{
	public void display()
		{
			String color;
			System.out.println("Enter the color of Car :");
			color=sc.nextLine();
			System.out.println("color of Car :"+color);
		}
	

public void honk()
	 {
	     System.out.println("Car is honking!");
	 }
}

public class Practical2 
{
public static void main(String[] args) 
{
    // Creating an object of CheckingAccount class
    CheckingAccount account = new CheckingAccount();

    // Calling deposit and withdraw methods
    account.deposit();
    account.withdraw();

    // Creating an object of Car class
    Car myCar = new Car();
    myCar.display();
    myCar.vehicle();
    myCar.honk();

    // Calling drive and honk methods
    myCar.drive();
    myCar.honk();
}
}
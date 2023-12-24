package Thursday_LAB;

import java.util.Scanner;

class PrimeNumbers //Parent class
{
 boolean isPrime(int n) 
 {
     if (n <= 1) 
     {
         return false;
     }
     for (int i = 2; i <= Math.sqrt(n); i++) 
     {
         if (n % i == 0) 
         {
             return false;
         }
     }
     return true;
 }
}

//Class for checking palindrome numbers
class PalindromeChecker extends PrimeNumbers //PalindromeChecker child class extends PrimeNumbers parennt class
{
 boolean isPalindrome(int n) 
 {
     int reversedNum = 0;
     int originalNum = n;

     while (n != 0)
     {
         int remainder = n % 10;
         reversedNum = reversedNum * 10 + remainder;
         n /= 10;
     }
     return originalNum == reversedNum;
 }
}

//Class for checking Armstrong numbers and displaying the pattern
class ArmstrongChecker extends PalindromeChecker// ArmstrongChecker child class extends PalindromeChecker child class
{
 boolean isArmstrong(int n) 
 {
     int originalNum = n;
     int digits = String.valueOf(n).length();
     int sum = 0;

     while (n > 0) {
         int digit = n % 10;
         sum += Math.pow(digit, digits);
         n /= 10;
     }
     return originalNum == sum;
 }

 void displayPattern(int rows) 
 {
     for (int i = 1; i <= rows; i++) 
     {
         for (int j = 1; j <= i; j++) 
         {
             System.out.print(j);
         }
         for (int j = i - 1; j >= 1; j--) {
             System.out.print(j);
         }
         System.out.println();
     }
 }
}

//Main class
public class Prcatical1 
{
 public static void main(String[] args) 
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Number To check Prime or not & Palindrome or not  as well as Armstrong or not = ");
	 
     int number =sc.nextInt() ;
     
     ArmstrongChecker checker = new ArmstrongChecker();

     if (checker.isPrime(number)) 
     {
         System.out.println(number + " is a prime number.");
     } 
     else 
     {
         System.out.println(number + " is not a prime number.");
     }

     if (checker.isPalindrome(number))
     {
         System.out.println(number + " is a palindrome number.");
     } 
     else 
     {
         System.out.println(number + " is not a palindrome number.");
     }

     if (checker.isArmstrong(number)) {
         System.out.println(number + " is an Armstrong number.");
     } 
     else 
     {
         System.out.println(number + " is not an Armstrong number.");
     }

     System.out.println("Pattern:");
     checker.displayPattern(4); // Change the number of rows as needed
 }
}

/* Q) Create a parent class called "Person" with attributes such as name, age, and a method called "speak". 
Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" 
and a method called "study". Create an object of the Student class and call both the "speak" and "study" methods.*/


package Thursday_LAB;

import java.util.Scanner;

class Person//parent class
{
	String name;
	int age;
	Scanner sc = new Scanner(System.in);
	public void speak()
	{
		System.out.println("Enter Parson Name = ");
		name=sc.nextLine();//Accept input from user
		System.out.println("Enter Person Age = ");
		age=sc.nextInt();//Accept input from user
		System.out.println("Person Name is = "+name);//Display Output
		System.out.println("Person Age is = "+age);//Display Output
	}
}
public class Student extends Person//child class
{
	char grade;
	public void study()
	{
		System.out.println("Enter Your Grade =");
		grade = sc.next().charAt(0);//Accept input from user
		System.out.println("Your Grade is="+grade);//Display Output
		
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.speak();// Parent class Function Call
		s1.study();// Parent class Function Call
		

	}

}
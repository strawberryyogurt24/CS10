package assignments;
/*

Program: assignment5.java          Date: April 19, 2022


Author: Ariana Paik
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class assignment82digit 
{

	private static Scanner input;

	public static void main(String[] args)
	{
	input = new Scanner(System.in);

	   //Values of each digit
	    int tens = 0;
	   int ones = 0;

	   //Prompt user to input 2 digit number  
	   System.out.println("Enter your 2 digit number:");
	   int number = input.nextInt();

	if (number <= 99 && number > 10)   // Checking condition for two digit number
	{

	   //Displays tens digit
	   tens = (number - (tens)) / 10;  // compare with your code
	   System.out.printf("\nTens place digit: " + tens);


	   //Display ones digit
	   ones = (number - (tens*10));   // compare with your code
	   System.out.printf("\nOnes place digit: " + ones);  
	}
	   //Error if number is less or more then two digits
	else                                                                    
	{      
	if (number > 999)
	   System.out.println("\nError! Too many digits(more then 2).");
	   if (number < 100)
	   System.out.println("Error! Too little digits (less then 2).");
	}



	}
	}
	/* Screen Dump
	Enter your 2 digit number:
	Tens place digit:
	Ones place digit:
	Error! Too many digits(more then 2).
	Error! Too little digits (less then 2)
	*/

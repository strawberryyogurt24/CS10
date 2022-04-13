package assignments;
/*

Program: assignment7.java          Date: April 13, 2022


Author: Ariana Paik
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class assignment7
{

	public static void main(String[] args) 
	{
     Scanner userinput = new Scanner(System.in);
	 System.out.println("Enter the change you have: ");	
     int change = userinput.nextInt();
     int quarters = change / 25;
     int dimes = ((change % 25)/10);
     int nickels = ((change % 25)%10)/5;
     System.out.println("The change you provided is:" + change );
     System.out.println("Quarters: " + quarters);
     System.out.println("Dimes: " + dimes);
     System.out.println("Nickels: " + nickels);
	}

}
/* Screen Dump
Enter the change you have:
*/
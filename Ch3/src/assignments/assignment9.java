package assignments;
/*

Program: assignment9.java          Date: April 19, 2022


Author: Ariana Paik
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class assignment9 
{
	
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter an integer:"); //user enters number
		int firstint = userinput.nextInt(); //grab and store number

		Scanner input = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a second interger:"); //user enters number
		int secondint = userinput.nextInt(); //grab and store number


		System.out.println(firstint + " / " + secondint + " = " + firstint / secondint +"\n"); // display answer and calculate equation
		System.out.println(firstint + " % " + secondint + " = " + firstint % secondint + "\n"); // display out answer and calculate equation


		System.out.println(secondint + " / " + firstint + " = " + secondint / firstint + "\n"); // display out answer and calculate equation
		System.out.println(secondint + " % " + firstint + " = " + secondint % firstint + "\n"); // display out answer and calculate equation

		}
		}


/* Screen Dump
Enter an integer:
First Integer:
Second Integer:
*/

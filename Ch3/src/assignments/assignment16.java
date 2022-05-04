package assignments;
/*

Program: assignment11.java          Date: May 4, 2022


Author: Ariana Paik
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class assignment16 
{

	   public static void main(String[] args) {

           int secretNumber;

           secretNumber = (int) (Math.random() * 19 + 1);           

           Scanner keyboard = new Scanner(System.in);

           int guess;

           do {

                 System.out.print("Enter a guess (1-20): ");

                 guess = keyboard.nextInt();

                 if (guess == secretNumber)

                       System.out.println("You Won!");

                 else if (guess < secretNumber)

                       System.out

                                  .println("Better luck next time.");

                 else if (guess > secretNumber)

                       System.out

                                  .println("Better luck next time.");

           } while (guess != secretNumber);

     }

}
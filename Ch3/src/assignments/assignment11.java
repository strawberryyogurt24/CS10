package assignments;

/*

Program: assignment11.java          Date: April 25, 2022


Author: Ariana Paik
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class assignment11 {

public static void main(String[] args) {
Scanner userinput = new Scanner(System.in);
System.out.println("Enter any three digits: ");
int numbers = userinput.nextInt();
int firstDig = numbers / 100;
int secondDig = (numbers % 100)/10;
int thirdDig = (numbers % 100)%10;
System.out.println("First Digit: " +  firstDig);
System.out.println("Second Digit:" + secondDig);
System.out.println("Third Digit:" + thirdDig);

int max = 0;
int min = 0;

       
       
     
       
        if(firstDig >secondDig)//85
        {
        max = firstDig;
        min = thirdDig;
           //579
        }
        else//58
        {
        max = thirdDig;
        min = firstDig;

        }
        System.out.println("The largest of the three digits is: " + max );
        System.out.println("The smallest of the three digits is:" + min);
        System.out.println("The sum of the three digits is:" + (firstDig +secondDig+thirdDig));
        System.out.println("The product of the three digits is:" + firstDig * secondDig * thirdDig);
        System.out.println("The average of the three digits is:" + (firstDig +secondDig+thirdDig)/3);
        }
        }
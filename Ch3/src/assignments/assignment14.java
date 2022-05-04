package assignments;
/*

Program: assignment11.java          Date: May 4, 2022


Author: Ariana Paik
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class assignment14 
{

	public static void main(String[] args) 
	{
		 int age;
		 Scanner input=new Scanner(System.in);
		 
		 System.out.println("Enter the age:");
		 age=input.nextInt();
		 input.close();
		 
		 if (age >18){
		 System.out.println("adult");
		 } else {
		 if(age<=5){
		 System.out.println("toddler");
		 } else{
		 if(age<=10){
		 System.out.println("child");
		 } if(age<=12){
		 System.out.println("preteen");
		 } else{
		 if(age>12){
		 System.out.println("teen");
		 }
		 }
		 }
		 }
		 }

		
}


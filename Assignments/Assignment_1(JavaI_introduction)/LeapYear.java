

// Write program to find Leap Year Or Not //

package basic_java;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] arg) {
		
		int Year;                                             //Variable initialization //

		Scanner sc = new Scanner(System.in);					// to get users input //
		System.out.print("Enter year :");
		Year = sc.nextInt();
		if(Year%4==0)											//Conditional_Statments//
		{
			System.out.println("This Year Is Leap Year");
			
		}

		else
		{
			System.out.println("This Year Is Not Leap Year");

		}
		
	}
	

}

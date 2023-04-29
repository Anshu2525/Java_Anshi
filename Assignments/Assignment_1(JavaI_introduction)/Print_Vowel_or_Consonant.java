

// Write Program to find Vowel or Consonant number and print the output.  //


package basic_java;

import java.util.Scanner;

public class Print_Vowel_or_Consonant {

	public static void main(String[] args)
	{
	
		char N;																	//Variable initialization //
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter alphabet : ");
		N = sc.next().charAt(0);
		if(N=='a' || N=='e' ||N=='i' || N=='o' || N=='u')						//Condition check (Conditional Statments)//
		{
			
				System.out.println("The alphabet is vowel");
								
		}
		else if(N=='A' || N=='E' ||N=='I' || N=='O' || N=='U')
		{
		  
			System.out.println("The alphabet is vowel");
		}
		
		else
		{
			System.out.println("The alphabet is Consonant ");
			
		}
		
		
		}
}

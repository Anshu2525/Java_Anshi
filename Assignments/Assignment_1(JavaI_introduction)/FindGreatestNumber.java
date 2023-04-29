 
//Write a Program to get Input from users and find Greatest number //


package basic_java;

import java.util.Scanner;

public class FindGreatestNumber {
	
	public static void main(String[] args) {
		
		int n1,n2,n3;											//variable initialization //
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of n1= ");
		n1 = sc.nextInt();
		System.out.print("Enter Value of n2= ");
		n2 = sc.nextInt();
		System.out.print("Enter Value of n3= ");
		n3 = sc.nextInt();
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("the greatest number is="+n1);
			}
			else
			{
				System.out.println("the greatest number is="+n3);
				
			}
		}
		else
			{
				if(n2>n3)
				{
					System.out.println("the greatest number is="+n2);
				}
				else
				{
					System.out.println("THE ENTERED VALUE IS INVAILD");

					
				}
					
			}
			
				}
				
		
		
	}



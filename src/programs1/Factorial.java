package programs1;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int Num ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Num = ");
		Num = sc.nextInt();
		
		int Fact=1 ;
		for (int i =1; i<=Num-1; i++)
		{
			Fact=Num*i;
		}
		System.out.println("Factorial = " +Fact);
	}
}

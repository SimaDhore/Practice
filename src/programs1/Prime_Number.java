package programs1;
import java.util.Scanner;
public class Prime_Number 
{
	public static void main(String[] args)
	{
		int Num;
		Scanner sc = new Scanner (System.in);
		Num = sc.nextInt();
		
		int Count=0;
		for(int i=1; i<=Num; i++)
		{
			if(Num%i ==0)
			{Count++;}
		}
		
		if (Count ==2)
		{
		System.out.println(Num +" is prime number");	
		}
		else
		{
			System.out.println(Num +" is not a prime number");		
		}
	}


}

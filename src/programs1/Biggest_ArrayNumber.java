package programs1;

import java.util.Scanner;

public class Biggest_ArrayNumber 
{
	
public static void main(String[] args)
{
int [] ar= new int[5];
Scanner sc = new Scanner (System.in);
System.out.print("Enter array elements = ");
System.out.println(" ");

for(int i=0; i<=ar.length-1; i++)
{
	ar[i]= sc.nextInt();
}

int Max = ar [0];
for (int i= 1; i<=ar.length-1;i++)
{
	if (ar[i]>Max)
	{
		Max=ar[i];
	}
}
System.out.println("Biggest element of array is " + Max);
}
}

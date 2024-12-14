package programs1;

import java.util.Scanner;

public class Counting_digitsInNumbers 
{
public static void main(String[] args) 
{
	int n;int count=0;
Scanner SC = new Scanner (System.in);
System.out.print("Enter number here = ");
n=SC.nextInt();

while(n>0)
{
n=n/10;
count++;
}
System.out.println("Digits in number = "+count);
}
}

package programs1;

import java.util.Scanner;

public class PalindromeNo4 
{
public static void main(String[] args)
{
int Num ;
Scanner SC = new Scanner(System.in);
System.out.print("Enter Num = ");
Num = SC.nextInt();

int Temp =Num;       //121    12   1
int Rem=0;
int RevNum =0;

while (Temp!=0)
{
	Rem =Temp%10;           //121%10=1     12%10=2   1%10=1
	RevNum=RevNum*10+Rem;   //0*10+1=1      1*10+2=12    12*10+1=121
	Temp=Temp/10;           //121/10=12     12/10=1       1/10=0
}
System.out.println("RevNum = "+RevNum);
if(Num ==RevNum)
{System.out.println("It is palindrome no.");}
else
{System.out.println("It is not palindrome no.");}
}
}

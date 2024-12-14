package string_Programs;
import java.util.Scanner;
public class Removing_Digit 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner (System.in);
System.out.print("Enter Name = ");
String Name = sc.next();               System.out.println("");

String Digits = "";
String Alph = "";
for(int i=0; i<=Name.length()-1; i++)
{
	char no = Name.charAt(i);
	if (!Character.isDigit(no))
	{Alph=Alph+no;}
	else
	{Digits= Digits+no;}
}
System.out.println("Alphabets = "+Alph);
System.out.println("Digits = "+Digits);
}
}

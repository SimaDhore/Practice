package string_Programs;
import java.util.Scanner;
public class PalindromeString4 
{
public static void main(String[] args) 
{
String Name;
Scanner SC = new Scanner(System.in);
System.out.print("Enter Name = ");
Name= SC.nextLine();

String RevName ="";
for(int i=Name.length()-1; i>=0;i--)
{RevName=RevName+Name.charAt(i);}

if (Name.equals(RevName))
{System.out.println(Name + " is a palindrome string");}
else
{System.out.println(Name + " is not a palindrome string");}
}
}

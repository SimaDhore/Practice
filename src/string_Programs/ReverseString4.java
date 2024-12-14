package string_Programs;

import java.util.Scanner;

public class ReverseString4 
{
public static void main(String[] args) 
{
String Name;
Scanner S = new Scanner(System.in);
System.out.print("Enter the name = ");
Name = S.nextLine();
                                          System.out.println(" ");
String RevName ="";
for(int i=Name.length()-1; i>=0; i--)
{
RevName=RevName+Name.charAt(i);	
}
System.out.println(RevName);
}
}

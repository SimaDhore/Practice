package string_Programs;

import java.util.Scanner;

public class First_Non_Repeat 
{
public static void main(String[] args) 
{
String Name;
Scanner sc = new Scanner (System.in);
System.out.println("Enter String = ");
Name = sc.nextLine();

for (int i=0; i<=Name.length()-1; i++)
{
boolean unique = true;
for (int j=0; j<=Name.length()-1; j++)
{
	if(i!=j && Name.charAt(i)== Name.charAt(j))
	{
		unique =false;		
	}
}
if(unique)
{
	System.out.println("First non repeated char is = "+Name.charAt(i));
	break;
}
}
}
}

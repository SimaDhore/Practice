package string_Programs;

import java.util.Scanner;
public class Repeat_Char_String 
{
public static void main(String[] args) 
{
String Name;
Scanner sc = new Scanner(System.in);
System.out.print("Enter String = ");
Name=sc.nextLine();                    System.out.println("");

int count ;
char[] Ar = Name.toCharArray();
for (int i=0; i<Ar.length; i++)
   {
	count = 1;
	 for(int j=i+1; j<Ar.length; j++)
	     {
		 if(Ar[i]==Ar[j] && Ar[i] !=' ')
		    {
			 count++;
			 Ar[j]='0';
			 }
	     }
	 if (count>1 && Ar[i] !='0')
	 {
		 System.out.println("Duplicate string is = "+Ar[i]+" "+count);
	 }
   }
}
}

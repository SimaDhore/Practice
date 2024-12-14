package string_Programs;

import java.util.Scanner;

public class Count_A_1_Spceial_Space 
{
public static void main(String[] args) 
{
//	Scanner sc = new Scanner (System.in);
//	System.out.println("Enter string = ");
//	String Name = sc.next();
	
	String Name = " S! 1v1 @";
	
	String Alph = "";
	String Dig ="";
	String Space = "";
	String Spc = "";
	int countA =0; int countD =0; int countSpace =0; int countSpc =0;
	for (int i=0; i<=Name.length()-1; i++)
	{
		char w = Name.charAt(i);
		
		if(Character.isLetter(w))
		{Alph = Alph+w; countA++;}
		
		else if (Character.isDigit(w))
		{Dig=Dig+w; countD++;}
		
		else if (Character.isWhitespace(w))
		{Space =Space+w; countSpace++;}
		
		else 
		{Spc=Spc+w; countSpc++;}
	}
	System.out.println("Letters =" +Alph+" and Count ="+countA );
	System.out.println("Numbers =" +Dig+" and Count ="+countD );
	System.out.println("Speces =" +Space+" and Count ="+countSpace );
	System.out.println("SpChar =" +Spc+" and Count ="+countA );
}
}

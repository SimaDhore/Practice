package string_Programs;

import java.util.Scanner;

public class Reverse_String_Without_String_Class 
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Pankaj");
		System.out.println("Original = " + str);
		System.out.println("Reversed = " + str.reverse());
		
		StringBuilder str2 = new StringBuilder("SimaPankaj");
		System.out.println("Original = " + str2);
		System.out.println("Reversed = " + str2.reverse());
	}


}

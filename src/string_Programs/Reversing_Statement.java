package string_Programs;

public class Reversing_Statement 
{
	public static void main(String[] args) 
	{
		String Line = "Sima Pankaj Mahto";

		String [] ar = Line.split("");
String Rev ="";
		for (int i =ar.length-1; i>=0; i--)
		{
			Rev = Rev+ar[i];
		}
		System.out.println(Rev+" ");                  //Reversed statement
		
		String Rev2 ="";
		for (int j =Rev.length()-1; j>=0; j--)
		{Rev2 =Rev2+Rev.charAt(j);}
		System.out.println(Rev2+" ");                 //Reversed each words
	}


}

package string_Programs;
import java.util.Scanner;
public class Reversing_Words_In_Statement 
{
public static void main(String[] args) 
{
//Scanner sc = new Scanner (System.in);
//System.out.println("Enter statement = ");
//String Line = sc.next();
String Line = "Sima Panakj Mahto";
	
String[] ar = Line.split(" ");

for(int i=0; i<=ar.length-1; i++)
{
	String org = ar[i];
    String Rev="";

    for (int j=org.length()-1; j>=0; j--)
    {Rev=Rev+org.charAt(j);}
System.out.print(Rev+" ");
}
}
}

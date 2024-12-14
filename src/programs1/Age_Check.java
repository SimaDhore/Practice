package programs1;
import java.util.Scanner;
public class Age_Check 
{
public static void main(String[] args) 
{
	int Age;
Scanner sc = new Scanner (System.in);
System.out.print("Enter Age = ");
Age=sc.nextInt();

if(Age>=18 & Age<60)
{
System.out.println("Elegible for vote");	
}
else
{
System.out.println("Not elegible for vote");	
}
}
}

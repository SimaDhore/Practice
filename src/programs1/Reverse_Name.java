package programs1;
import java.util.Scanner;
public class Reverse_Name 

{
	public static void main(String[] args) 
	{
		String Name;
		Scanner SC = new Scanner (System.in);
		System.out.print("Enter Name = ");
		Name =SC.nextLine();
		
		String Rev =" ";
		for (int i =Name.length()-1; i>=0; i--)
		{
			Rev = Rev + Name.charAt(i);
		}
		System.out.println(Rev);
	}


}

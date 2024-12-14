package programs1;

import java.util.Scanner;

public class Lowest_Element 
{
public static void main(String[] args) 
{
     int [] ar = new int [4];
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number = ");
                                                                         System.out.println(" ");
     for(int i=0; i<=ar.length-1; i++)
     {
    	 ar[i] = sc.nextInt();
     }
     
     int Min = ar[0];
     for(int i =1; i<=ar.length-1; i++)
     {
    	 if(ar[i]<Min)
    	 {
    		Min=ar[i]; 
    	 }
     }
     System.out.println("Lowest element of array "+ Min);
}
}

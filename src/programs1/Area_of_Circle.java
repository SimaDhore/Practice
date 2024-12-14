package programs1;

import java.util.Scanner;

public class Area_of_Circle 
{
public static void main(String[] args) 
{
	int Radius ;
	Scanner sc = new Scanner (System.in);
	System.out.print("Radius = ");
	Radius = sc.nextInt();
	
float pi= 3.14f;
float Area_Of_Circle = pi*Radius*Radius;
System.out.println(Area_Of_Circle);
}
}

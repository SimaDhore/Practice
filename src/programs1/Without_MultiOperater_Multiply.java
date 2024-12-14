package programs1;

public class Without_MultiOperater_Multiply 
{
public static void main(String[] args) 
{
	System.out.println(Multi(5, 5));
}

public static int Multi(int num1, int num2)
{
	int sum =0;
	for (int i=1; i<=num1; i++)     //1    //2      3        4        5
	{ sum = sum +num2;}             //0+5  //5+5   10+5     15+5     20+5
	return sum;
	
}
}

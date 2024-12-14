package programs1;
import java.util.Scanner;
public class Armstrong_Numbers
{
public static void main(String[] args) 
{
int n; 
Scanner sc =new Scanner (System.in);
System.out.print("Enter number n = ");   //16+625+81+256
n=sc.nextInt();

int count=0;
while(n>0)          //n=1643>0        164>0        16>0       1>0
{
n=n/10;count++;     //164; count1   16; count2   1; count3    0; count4
}

int c=n; int rem; int arm=0;
if (count==3)
{
    while(n>0)               
    {
	rem=n%10;
	arm=(rem*rem*rem)+arm;
	n=n/10;
    }
   if(c==arm)
   {
    System.out.println("Armstrong number");
    }
    else 
    {
    System.out.println("Not a armstrong number");	
    }
}
else if(count==4)
{
	while(n>0)                           //1634>0
	{
		rem=n%10;                        //4          3         6           1
		arm=(rem*rem*rem*rem)+arm;       //4^4+0   3^4+256     6^4+337   1^4+1633    ==1634
		n=n/10;                          //163       16         1          0
	}
	if(c==arm)
	{
	System.out.println("Armstrong number");
	}
	else 
	{
	System.out.println("Not a armstrong number");	
	}	
}
}
}


package programs1;
import java.util.Scanner;
public class Armstrong_No 
{
public static void main(String[] args) 
{
	for(int i=1; i<=999; i++)
	{findArmstrongNo(i);}
}
public static void findArmstrongNo (int Num)
{
int Sum =0;
int Rem;
for (int i=Num; i>0; i=i/10)
{
	 Rem = i%10;
	Sum= Sum+(Rem*Rem*Rem);
}
if (Num==Sum)
{System.out.println(Num + " is palendrome no.");}

}
}

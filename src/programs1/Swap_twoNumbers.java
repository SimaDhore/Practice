package programs1;

public class Swap_twoNumbers 
{
public static void main(String[] args) 
{
int Num1 =10;
int Num2 = 20;

Num2=Num1 + Num2;
Num1 = Num2-Num1;
Num2 = Num2-Num1;

System.out.println(Num1);
System.out.println(Num2);

int Num3=10;
int Num4=20;
int Num5;

Num5=Num3+Num4;
Num3 = Num5-Num3;
Num4 =Num5-Num4;

System.out.println(Num3);
System.out.println(Num4);

}
}

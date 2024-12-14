package string_Programs;

public class First_Repeated
{
public static void main(String[] args)
{
String Name = "simppkl";
for (int i=0; i<Name.length(); i++)
{
for (int j=0; j<Name.length(); j++)
{
if(i!=j && Name.charAt(i)==Name.charAt(j))
{System.out.println("First repeated char = "+Name.charAt(i));break;}
}

}
}
}

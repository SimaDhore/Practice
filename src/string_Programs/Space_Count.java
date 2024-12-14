package string_Programs;

public class Space_Count 
{
	public static void main(String[] args) 
	{
		String Name = "Pa n k ! a j ";
		int count =0;
		for (int i=0; i<=Name.length()-1; i++)
		{
			char w = Name.charAt(i);
//			if (Character.isWhitespace(w))
//			{count++;}
			
			if (w==' ')
			{count++;}
		}
		System.out.println("Conut of spaces = "+count);
	}

}

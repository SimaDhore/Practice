package string_Programs;

public class Reversing_words2 
{
	public static void main(String[] args) 
	{
		String Line = "Sima Pankaj Mahto";

		String [] ar = Line.split("");
		  
		for (int i=0; i<=ar.length-1; i++)
		{
			 String org=ar[i];                    // Sima
			//System.out.print(org);
			
			String Rev2 ="";  
			             //3 2  1  0
			for(int j=org.length()-1; j>=0; j--)
			{ Rev2 = Rev2+org.charAt(j);}          //a  m i  s
			System.out.print(Rev2);
		}
	}
	}



package hashMap;
import java.util.HashMap;
import java.util.Set;
public class Each_word_In_Sentence 
{
public static void main(String[] args) 
{                //012345
	String Line = "Sima Pankaj Mahto Pankaj Sima Dhore";
	String[] L1 = Line.split("");
	HashMap <String, Integer> hm = new HashMap<>();
	
	for(int i=0; i<=L1.length-1; i++)
	{
		String L2 =L1[i];         //s i m a  p     pankaj    Mahto
		
		if(hm.containsKey(L2))    //true
		{hm.put(L2, hm.get(L2)+1);}      //<Pankaj, 1+1>
		else
		{hm.put(L2, 1);} 
		              //<Sima, 2>  <Pankaj, 2>  <Mahto, 1>  <Dhore, 1>
	}
	
	Set<String> allwords = hm.keySet();
	for (String L3 :allwords)
	{System.out.println(L3 +" =" +hm.get(L3));}
}
}

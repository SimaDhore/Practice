package hashMap;
import java.util.HashMap;
import java.util.Set;
public class HashMap_OccuranceOfEachCharInAString 
{
public static void main(String[] args)
{
String str="abcaba";
HashMap <Character, Integer> hm = new HashMap<>();

for(int i =0; i<=str.length()-1; i++)
{
	      char S1 = str.charAt(i);	
	      
	      if (hm.containsKey(S1))
	      {hm.put(S1, hm.get(S1)+1);}
	      else
	      {hm.put(S1, 1);}
}
    Set<Character> allkeys = hm.keySet();
    
    for (Character S2: allkeys)
    {
    	if(hm.get(S2)>1)
    	{
    	System.out.println(S2 + " "+hm.get(S2));
    	}
    }
}
}

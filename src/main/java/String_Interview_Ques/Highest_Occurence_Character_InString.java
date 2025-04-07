package String_Interview_Ques;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class Highest_Occurence_Character_InString
{

	public static void main(String []args)
	{
		String str="sdfjlndviedasadkjbad";
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char value =str.charAt(i);
			
			if(map.containsKey(value))
			{
				map.put(value,map.get(value)+1);
			}
			else
			{
				map.put(value,1);
			}
		}
		
		Set<Entry<Character,Integer>> itr=map.entrySet();
		
		int maxcount=0;
		char maxchar=' ';
		
		for(Entry<Character,Integer>obj:itr)
		{
			if(maxcount<obj.getValue())
			{
				maxcount=obj.getValue();
				maxchar=obj.getKey();
			}
		}
		System.out.println("Highest occurence character in string  => "+maxchar );
		System.out.println("Highest occurence value is => "+maxcount);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

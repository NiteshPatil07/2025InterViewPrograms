package String_Interview_Ques;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;


public class Highest_Occrence_String_In_StringArray {

	public static void main(String[]args)
	{
	  String [] str= {"Nitesh","Kundan" ,"Amey" ,"Nitesh"," Jack"," Nicholas" ,"Nitesh"};
		
		//String [] strsplit =str.split(" ");
		
		
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		
		for(int i=0;i<=str.length-1;i++)
		{
			String value =str[i];
			
			if(map.containsKey(value))
			{
				map.put(value,map.get(value)+1);
			}
			else
			{
				map.put(value,1);
			}
		}
		
		
		Set<Entry<String,Integer>>itr=map.entrySet();
		
		int maxcount = 0;
		
		String maxstring = " ";
		
		for(Entry<String,Integer>obj:itr)
		{
			if(maxcount<obj.getValue())
			{
				maxcount=obj.getValue();
				maxstring=obj.getKey();
			}
		}
		
		System.out.println("Highest occuring string => "+maxstring);
		System.out.println("Highest occurring value => "+maxcount);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

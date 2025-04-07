package Array_Interview_Que;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class FindOut_Highest_Occrence_Number_In_Array {

	public static void main(String[]args)
	{
		int [] a= {1,3,4,6,3,2,2,1,1,2,3,2,3,1,2,3};
		
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length-1;i++)
		{
			int value=a[i];
			
			if(map.containsKey(value))
			{
				map.put(value,map.get(value)+1);
			}
			else
			{
				map.put(value,1);
			}
		}
		
		Set<Entry<Integer,Integer>>itr=map.entrySet();
		
		int maxcount=0;
		int maxnumber=0;
		
		for(Entry<Integer,Integer>obj:itr)
		{
			if(maxcount<obj.getValue())
			{
				maxcount=obj.getValue();
				maxnumber=obj.getKey();
			}
		}
		System.out.println("Highest occurnec number is => "+maxnumber);
		System.out.println("Highest occurence value is => "+maxcount);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package String_Interview_Ques;

public class Findout_Specific_Charactercount_In_String {

	public static void main(String[]args)
	{
		String str="AASFDJJSLLMDGYSIOBVJFGSDDAAGHAJ";
		
		int count=0;
		
		char target='A';
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(target==str.charAt(i))
			{
				count++;
			}
		}
		System.out.println("Value of A is  => "+count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

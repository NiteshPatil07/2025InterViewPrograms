package Array_Interview_Que;

public class Second_HighestNum_In_Array {

	public static void main(String[]args)
	{
		int [] number = {76,27,372,363,262,235,24,268,62};
		
		int first=Integer.MIN_VALUE;
		
		int second=Integer.MIN_VALUE;
		
		for(int num:number)
		{
			if(num>first)
			{
				second=first;
				first=num;
			}
			else if(num>second && num!=second)
			{
				second=num;
			}
		}
		if(second==Integer.MIN_VALUE)
		{
			System.out.println("There is no second highest number in array");
		}
		else
		{
			System.out.println("Second Highest number in array "+second);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

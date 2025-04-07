package Array_Interview_Que;

public class FindOut_Index_Of_Target_Number 
{

	public static void main(String[]args)
	{
		int [] numbers = {12,34,449,37,262,384,25,26,48,48,1252,373,39,38,9};
		
		int target=449;
		
		int index=-1;
		
		for(int i=0;i<=numbers.length-1;i++)
		{
			if(numbers[i]==target)
			{
				index=i;
			}
		}
		if(index!=-1)
		{
			System.out.println("Target number is found array index "+index);
			
		}
		else
		{
			System.out.println("Target Number is not fount in array");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

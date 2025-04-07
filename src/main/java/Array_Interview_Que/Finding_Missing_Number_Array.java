package Array_Interview_Que;

public class Finding_Missing_Number_Array {

	public static void main(String[]args)
	{
		
		int [] numbers = {1,2,3,5,6,7,8,9};
		
		int n =9;
		
		int missnum=0;
		int actsum=0;
		int expsum=n*(n+1)/2;
		
		for(int num:numbers)
		{
			actsum=actsum+num;
			
			missnum=expsum-actsum;
		}
		System.out.println(missnum);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}

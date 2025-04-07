package Array_Interview_Que;

public class Find_Missing_Number_In_Array {

	public static void main(String[]args)
	{
		
		int [] num= {1,2,3,4,5,6,8,9};
		
		int n=9;
		
		int actsum=0;
		int missnum=0;
		int expsum=n*(n+1)/2;
		
//		for(int i=0;i<num.length;i++)
//		{
//			actsum=actsum+num[i];
//			
//			missnum=expsum-actsum;
//		}
//		System.out.println(missnum);
		
		
		for(int obj :num)
		{
			actsum=actsum+obj;
			missnum=expsum-actsum;
		}
		System.out.println(missnum);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

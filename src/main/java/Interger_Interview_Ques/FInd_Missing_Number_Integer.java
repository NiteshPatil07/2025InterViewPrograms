package Interger_Interview_Ques;

public class FInd_Missing_Number_Integer {

	
	public static void main(String[]args)
	{
		int numbers =12356789;
		
		int n=9;
		
		String numstr=String.valueOf(numbers);
		int [] a=new int [numstr.length()];
		
		for(int i=0;i<numstr.length();i++)
		{
			a[i]=numstr.charAt(i)-'0';
		}
		
		int missnum=0;
		int actsum=0;
		int expsum=n*(n+1)/2;
		
		for(int num:a)
		{
			actsum=actsum+num;
			missnum=expsum-actsum;
		}
		
		System.out.println(missnum);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

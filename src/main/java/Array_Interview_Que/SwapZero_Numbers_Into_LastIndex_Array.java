package Array_Interview_Que;

import java.util.Arrays;

public class SwapZero_Numbers_Into_LastIndex_Array {

	public static void main(String[]args)
	{
		int [] a= {1,3,5,6,0,0,1,3,4,};
		
		int count=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]!=0)
			{
				a[count++]=a[i];
			}
		}
		while(count<a.length)
		{
			a[count++]=0;
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

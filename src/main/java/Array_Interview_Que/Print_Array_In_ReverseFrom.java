package Array_Interview_Que;
import java.util.Arrays;

public class Print_Array_In_ReverseFrom {

	public static void main(String[]args)
	{
		int [] a= {30,40,50,30 ,10 ,70,80,90,100};
		
		int left=0; int right = a.length-1;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[left]<a[right])
			{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				
				left++;
				right--;
				
				
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

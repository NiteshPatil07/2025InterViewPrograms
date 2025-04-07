package Array_Interview_Que;

import java.util.Arrays;

public class BubbleSort_Array {

	
	
	public static void main(String[]args)
	{
		
		 int [] a = {102,384,372,263,483,282,222,828,163,373};
		 
		 for(int i=0;i<a.length-1;i++)
		 {
			 for(int j=0;j<a.length-1-i;j++)
			 {
				 if(a[j]>a[j+1])
				 {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
			 }
		 }
		 System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

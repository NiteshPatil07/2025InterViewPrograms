package Array_Interview_Que;

public class HighestNumber_In_Arrays 
{
       public static void main(String[]args)
       {
    	   int [] numbers= {10,38,47,24,289,47};
    	   
    	   int max=numbers[0];
    	  
    	   for(int i=0;i<=numbers.length-1;i++)
    	   {
    		   if(numbers[i]>max)
    		   {
    			   max=numbers[i];
    		   }
    	   }
    	   
    	  
    	   System.out.println(max);
    	   
       }
}

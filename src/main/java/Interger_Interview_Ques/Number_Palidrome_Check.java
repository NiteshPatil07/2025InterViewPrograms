package Interger_Interview_Ques;

public class Number_Palidrome_Check {

   public static void main(String[]args)
   {
		int number= 10123;
		
		int orginal=number;
		
		int reverse = 0;
		
		while(number> 0)
		{
		   int digit=number%10;	
		   reverse =reverse*10+digit;
		   number=number/10;
		}
		
	     if(orginal==reverse)
	     {
	    	 System.out.println("Number is palindrome");
	     }
	     else
	     {
	    	 System.out.println("Number is not palindrome");
	     }
   }
     

 
}

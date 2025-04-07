package Interger_Interview_Ques;

public class Prime_numbers_List {

	
	public static void main(String[]args)
	{
		int temp=0;
		
		for(int i=2;i<=30;i++)
		{
			for(int j=2;j<=i-j;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println("This is Prime Number  "+i);
			}
			else
			{
				temp=0;
			}
				
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

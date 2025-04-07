package String_Interview_Ques;

public class StringPalindrom_Checker {

	public static void main(String[]args)
	{
		String str="nayan";
		
		String rename="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rename=rename+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rename))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

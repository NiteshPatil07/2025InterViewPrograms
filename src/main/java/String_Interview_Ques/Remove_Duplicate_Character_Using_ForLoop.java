package String_Interview_Ques;

public class Remove_Duplicate_Character_Using_ForLoop {

	public static void main(String[]args)
	{
		String str="I am nitesh I am from pune";
		
		String result="";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			String CharToString =String.valueOf(str.charAt(i));
			
			if(CharToString.equals(" ")||!result.contains(CharToString))
			{
				result=result+CharToString;
			}
		}
		
		String Improveresult=result.replaceAll("\\s+"," ");
		System.out.println(Improveresult);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

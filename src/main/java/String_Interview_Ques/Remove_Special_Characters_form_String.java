package String_Interview_Ques;

public class Remove_Special_Characters_form_String {

	public static void main(String[]args)
	{
		String str="Nitesh)(*###0980Kantilal#@%@#098Patil";
		
		String newWord=" ";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>64 && str.charAt(i)<=122)
			{
				newWord=newWord+str.charAt(i);
			}
		}
		
		System.out.println(newWord);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

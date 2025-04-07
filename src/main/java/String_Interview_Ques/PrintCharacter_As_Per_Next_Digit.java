package String_Interview_Ques;

public class PrintCharacter_As_Per_Next_Digit {

	public static void main(String[]args)
	{
		String number="a2b3d4";
		
		StringBuilder sba=new StringBuilder();
		
		for(int i=0;i<number.length();i++)
		{
			char ch=number.charAt(i);
			
			if(Character.isLetter(ch))
			{
				int count= number.charAt(i+1)-'0';
				
				sba.append(String.valueOf(ch).repeat(count)).append(" ");
			}
		}
		System.out.println(sba.toString().trim());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

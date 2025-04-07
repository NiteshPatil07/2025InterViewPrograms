package String_Interview_Ques;



import java.util.TreeSet;
public class Remove_Duplicate_Character_In_String_With_Set {

	public static void main(String[]args)
	{
				String str="nitesh kantilal patil";
		
				TreeSet<Character> set=new TreeSet<Character>();
				StringBuilder sba=new StringBuilder();
				
				for(int i =0;i<=str.length()-1;i++)
				{
					char ch=str.charAt(i);
					
					if(!set.contains(ch))
					{
						set.add(ch);
						sba.append(ch);
					}
				}
		System.out.println(sba.toString().trim());
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

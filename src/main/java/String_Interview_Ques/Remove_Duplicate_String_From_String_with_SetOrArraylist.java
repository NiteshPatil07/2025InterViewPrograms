package String_Interview_Ques;

import java.util.TreeSet;

public class Remove_Duplicate_String_From_String_with_SetOrArraylist {

	public static void main(String[]args)
	{
		String str="I am nitesh I am from pune";
		
		String [] strsplit=str.split(" ");
		
		StringBuilder sba=new StringBuilder();
		
		 TreeSet<String> set=new TreeSet<String>();
		 
		 for(int i=0;i<=strsplit.length-1;i++)
		 {
			 String value =strsplit[i];
			 if(!set.contains(value))
			 {
				 set.add(value);
				 sba.append(value);
				 sba.append(" ");
			 }
		 }
		 System.out.println(sba.toString());
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

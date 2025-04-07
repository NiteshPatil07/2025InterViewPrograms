package String_Interview_Ques;

public class FirstLower_LastLowe_Make_String 
{
 public static void main(String[]args)
 {
	 String names="Nitesh Kantilal Patil";
		
		String Rename=" ";
		
		String [] splitstr= names.split(" ");

		
		for(String nam:splitstr)
		{
			int length=nam.length();
			
			String firstchar= nam.substring(0,1);
			
			String restchar=nam.substring(1,length-1);
			
			String lastchar=nam.substring(length-1,length);
			
			Rename=Rename+firstchar.toLowerCase()+restchar+lastchar.toUpperCase()+" ";
			
		}
		System.out.println(Rename);
		
		
 }
	
	
	
	
	
	
	
	
	
}

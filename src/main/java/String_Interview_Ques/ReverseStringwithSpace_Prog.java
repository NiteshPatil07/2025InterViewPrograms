package String_Interview_Ques;

public class ReverseStringwithSpace_Prog {

	
	
	public static void main(String []args)
	{
		String str="Nitesh Kantilal Patil";
		
		String [] splitstr= str.split(" ");
		
		StringBuilder sba=new StringBuilder();
		
		for(int i=splitstr.length-1;i>=0;i--)
		{
			sba.append(splitstr[i]);
			sba.append(" ");
		}
		
		System.out.println(sba.toString().trim());
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package Array_Interview_Que;

public class Rotate90_Degree_2DArray {

	public static void main(String[]args)
	{
		
		int [][] matrix= 
			{{1,2,3},
			{4,5,6},
			{7,8,9}};
		
		
		int n=matrix.length;
		
		int [][] roll=new int [n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				roll[j][n-1-i]=matrix[i][j];
			}
		}
		
		for(int [] row:roll)
		{
			for(int ele:row)
			{
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

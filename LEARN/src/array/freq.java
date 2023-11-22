package array;

public class freq {
	
	public static void main(String[] args) 
	{
		int ar1[]= {3,2,2,4,2,1,5,7,8,9,1};
		
		int arr2[]= new int[ar1.length];
		
		int vis=-1;
		
		for(int i=0;i<ar1.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<ar1.length;j++)
			{
				if(ar1[i]==ar1[j])
				{
					count ++;
				}
			}
		}
		
	}

}

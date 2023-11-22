package array;

public class search_number {
	
	
	public static void main(String args[])
	{
		
		
		int[] array= {1,5,4,3,2,1,7,9};
		
		for(int num : array)
		{
			if(num==2)
			{
				System.out.print("number found");
				break;
			}
			else
			{
				System.out.print("number not found");
				
			}
		}
		
	}

}

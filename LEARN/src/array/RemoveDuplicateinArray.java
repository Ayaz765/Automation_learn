package array;

import java.util.Arrays;

public class RemoveDuplicateinArray

{
	
	public static void main(String args[])
	{
		int a[]= {1,2,2,6,6,8,8,4,2,3,4,5,6,6,7,5,3,88};
		int temp[]= new int[a.length];
		int j=0;
		
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]= a[i];
				j++;
			}
			
		}
		temp[j++]= a[a.length-1];
		
		

	
	for(int i=0;i<j;i++)
	{
		 a[i] = temp[i];  
		 
		 System.out.println(a[i]);
	}
	
}
}
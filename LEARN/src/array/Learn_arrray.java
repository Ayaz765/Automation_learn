package array;

import java.util.Arrays;
import java.util.Random;

public class Learn_arrray {
	public static void main(String arm[])
	{
		int[] first_array=getrandomArray(10);
		System.out.println(Arrays.toString(first_array));
		Arrays.sort(first_array);
		System.out.println(Arrays.toString(first_array));
		
		int[] newarray= new int[10];
		System.out.println(Arrays.toString(newarray));
		Arrays.fill(newarray, 9);
		System.out.println(Arrays.toString(newarray));
		
		
	}

	




private static int[] getrandomArray (int lenght){
	
	Random number= new Random();
	int[] new_number= new int[lenght];
	for(int i =0;i<lenght;i++)
	{
		new_number[i]=number.nextInt(100);
		
	}
		
	return new_number;
	
}
}

package array;

import java.util.Arrays;

public class Largest_element {

	public static void main(String[] args) {
	
		int array[]= {1,2,3,4,5,6,6,7,87,8,8,8,8,7,5,4,2,};
		
		Arrays.sort(array);
		
		System.out.println("Largest number is " + array[array.length-1]);
		

	}

}

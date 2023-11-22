package interview;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String s1[]= {"I love to my country"};
		
		String s2[]={"I love ot ym country"};
		
		Arrays.sort(s2);
		Arrays.sort(s1);
		
		if(Arrays.equals(s1, s2) == true)
		{
			  System.out.println("Both the strings are anagram");  
		}

	}

}
;
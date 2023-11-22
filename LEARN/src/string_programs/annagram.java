package string_programs;

import java.util.Arrays;

public class annagram {

	public static void main(String[] args) {
		
		String arg1= "abcdef";
		String arg2="fezcba";
		
		if(arg1.length()!=arg2.length()) {
			System.out.println("Length not equal");
		}
		else
		{
		
		char[] char1=arg1.toCharArray();
		char[] char2= arg2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		if(Arrays.equals(char1, char2)==true)
		{
			System.out.println("ok");
		}
		else
		{
			System.out.println("notok");
		}

	}

}
}

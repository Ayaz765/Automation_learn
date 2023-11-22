package string_programs;

public class Reverse_the_string {
	public static void main(String[] args) {
	
	String original_string= "I love my india and my bahrat maa";
	String reverse_string= "";
	
	StringBuilder plus= new StringBuilder(original_string);
	
	plus.reverse();
	System.out.print(plus);
	
	for(int i=original_string.length()-1;i>=0;i--)
	{
		reverse_string=reverse_string+ original_string.charAt(i);
	}
	 System.out.println("Orginal String = " + original_string);
     System.out.println("Reverse String =" +reverse_string);
	}
}

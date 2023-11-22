package string_programs;

public class Toggler {
	
	
	public static void main(String args[])
	{
		
		String tog="I luv to my COUntry";
		
		String toggler[]=tog.split("\\s");
		String togl="";
		
		for(String word:toggler)
		{
			String first=word.substring(0,1);
			String last=word.substring(1);
			
			togl=togl + first.toLowerCase() + last.toUpperCase() + " ";
			
			
		}
		
		System.out.println(togl);
		
	}

}

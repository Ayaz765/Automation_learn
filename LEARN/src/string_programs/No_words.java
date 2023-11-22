package string_programs;

public class No_words {
	
	public static void main(String[] args)
	{
	
		int count=0;
		String word= "I love my country ok ";
		String word1= word.trim();
		
		for(int i=0;i<word1.length();i++)
		{
		
			if(word1.charAt(i)== ' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}

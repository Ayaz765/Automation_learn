package string_programs;

public class No_of_char_in_string {

	public static void main(String[] args) {
		int count=0;
		
		String words= " Sachine is a great batsmen of era ";
		
		for(int i=0;i<=words.length()-1;i++)
		{
			if(words.charAt(i)!= ' ')
			{
				count++;
			}
		}
		System.out.print("Count_of_character_in_string = " + count);
 
	}

}

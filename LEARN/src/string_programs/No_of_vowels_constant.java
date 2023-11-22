package string_programs;

public class No_of_vowels_constant {

	public static void main(String[] args) {
		
		int CountVowel= 0;
		int cCount=0;
				
		String word= "aeiou aeiou";
		
		String words= word.toLowerCase();
		
		for( int i=0;i<words.length();i++)
		{
		
			if(words.charAt(i) == 'a'
					|| words.charAt(i) == 'e' 
					|| words.charAt(i) == 'i' 
					|| words.charAt(i) == 'o' 
					|| words.charAt(i) =='u')
			{
				CountVowel++;
		}
		
		else
		 {      
            
             cCount++;    
         }   
		
     }    
	
     System.out.println("Number of vowels: " + CountVowel);    
     System.out.println("Number of consonants: " + cCount);    

	}
}

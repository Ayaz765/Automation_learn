package interview;

public class vowel {

	public static void main(String[] args) 
	{
		String s1="You are so much cute";
		s1=s1.toLowerCase();
		int countv=0;
		int countc=0;
		
		for(int i=0;i<=s1.length();i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e')
			{
				countv++;
			}
			
			
			else if((s1.charAt(i)>='a') && (s1.charAt(i)<='z') )
			{
				countc++;
			}
			
			
		}

	}

}

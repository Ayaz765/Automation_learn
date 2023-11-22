
public  class No_of_character {
	
	public static void main(String args[])
	{
		
		String s="I luv character";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count ++;
;			}
			
		}
		System.out.print(count);
	}

}

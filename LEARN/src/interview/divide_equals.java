package interview;

public class divide_equals {

	public static void main(String[] args) {
		String Str1="Iloveyoum";
		int len=Str1.length();
		
		int n=3;
		int charo=len/n;
		int temp=0;
		String s2[] = new String[n];
		
		for(int i=0;i<len;i=i+charo)
		{
			String part=Str1.substring(i,+charo);
			
			s2[temp]=part;
			temp++;
			
		}
		  for(int i = 0; i <s2.length; i++) {  
              System.out.println(s2[i]);  
              }  

	}

}

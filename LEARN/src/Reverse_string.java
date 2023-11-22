
public class Reverse_string {

	public static void main(String[] args) {
		String rev="I love my country";
		char c;
		String revo=" ";
		
		for(int i=rev.length()-1;i>=0;i--)
		{
			c=rev.charAt(i);
			
			revo =revo + c;
			
		}
		
		System.out.print(revo);

	}

}

package string_programs;

public class Whitespace {

	public static void main(String[] args) {
		
		
		String str1="I am proud member of our country";
		
		str1=str1.replaceAll("\\s+" ,"");
		
		System.out.println(str1);
	}

}

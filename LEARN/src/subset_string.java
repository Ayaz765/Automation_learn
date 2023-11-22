
public class subset_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String str1 = "abcde", str2 = "cbaed";    
				
				
						
						
						if(str1.length()!=str2.length())
						{
							System.out.println("Lenght is not equal");
						}
				
						else
						{
							str1=str1.concat(str1);
							if(str1.indexOf(str2)!=(-1))
							{
								System.out.println("rotation");
							}
							else
							{
								System.out.println("Not rotation");
							}
						}

	}

}

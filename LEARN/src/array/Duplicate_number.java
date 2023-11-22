package array;

public class Duplicate_number {

	public static void main(String[] args) {
	
		int newarray[]= new int[]{1,9,3,1,4,2,4,2,4,2,6};
		
		for(int i=0; i<newarray.length;i++) {
			
			for(int j=i+1; j< newarray.length; j++)
			{
				if(newarray[i]==newarray[j]) {
					
					System.out.println("Duplicate number =" + newarray[j]);
					
				}
			}
		}

	}

}

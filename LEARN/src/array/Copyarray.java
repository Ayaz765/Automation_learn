package array;

public class Copyarray {

	public static void main(String[] args) {
		
		int ar1[] = {1,2,3,4,5,6};
		int ar2[] = new int[ar1.length];
		
		for(int i=0;i<ar1.length;i++)
		{
			ar2[i]=ar1[i];
		}
		for(int j=0; j<ar2.length;j++)
		{
			System.out.println(ar2[j] + "");
		}
		

	}

	
	}



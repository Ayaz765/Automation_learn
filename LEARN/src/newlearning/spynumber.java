package newlearning;

public class spynumber {

	public static void main(String[] args) {
		int n=133;
		int n1=n;
		int r;
		int sum=0;
		int prod=1;
		
		
		while(n>0)
		{
			r=n%10;
			sum=sum +r;
			prod=prod * r;
			n=n/10;
		}
		
		
		if(sum==prod)
		{
			System.out.println("Spyno");
		}
		
		else
		{
			System.out.println(" No Spyno");
			
		}
	}

}

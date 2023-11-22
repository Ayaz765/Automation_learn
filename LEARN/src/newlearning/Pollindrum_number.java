package newlearning;

public class Pollindrum_number {
	
	public static void main(String args[])
	{
		int num=5451;
		int num2=num;
		int reverse=0;
		int r;
		
		while(num>0)
		{
			r=num%10;
			reverse= (reverse *10) +r;
			num=num/10;	
			
		}
		
		if(num2==reverse)
		{
			System.out.println("The original number is Pollidrum =" + num2);
		}
		else
		{
			System.out.println("The original number is not Pollidrum =" + num2);
		}
	}

}

package newlearning;

public class fibo {

	public static void main(String[] args) {
		
		
		int a=-1;
		int b=1;
		int sum=0;
		
		for(int i=1;i<15;i++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}
		

	}

}

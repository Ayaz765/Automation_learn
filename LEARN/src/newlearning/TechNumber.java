package newlearning;

public class TechNumber {

	public static void main(String[] args) {
		
		int Firsthalfsum=0;
		int Secondhalfsum=0;
		double sum=0;
		
		
		int num1=4501;
		int countdigit=0;
		
		int num=num1;
		
		while(num >0)
		{
			countdigit++;
			num=num/10;
		}
		
		num= num1;
		Firsthalfsum=num%(int)Math.pow(10,countdigit/2);
		Secondhalfsum=num/(int)Math.pow(10,countdigit/2);
		
		//sum=Math.pow(Firsthalfsum,2) + Math.pow(Secondhalfsum,2) ;
		sum = (Firsthalfsum + Secondhalfsum) * (Firsthalfsum+ Secondhalfsum);  
		
		System.out.println(sum);
		
		
		
		
		

	}

}

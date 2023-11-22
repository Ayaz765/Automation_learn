
public class DECIMEL {

	public static void main(String[] args) {
		
		System.out.println("68inches ="   +convertToCentimeter(68) + "cm");
		System.out.println("5 feet,8 inches=   "+convertToCentimeter(5,8) +"cm");
		
		
	  }
		
		public static double convertToCentimeter(int inches)
		{
			
			return inches * 2.54;
		}

		
		
		public static double convertToCentimeter(int feet,int heightinches)
		{
			
			return convertToCentimeter ((feet*12)+heightinches) ;
		}
	}



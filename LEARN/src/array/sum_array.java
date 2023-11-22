package array;

public class sum_array {

	public static void main(String[] args) {
	
		int array[]= {1,2,3,4,5,56,6,7,7,7,8,9};
		int sum=0;
		
		for(int i=0; i<array.length;i++)
		{
			sum=sum + array[i] ;
		}
		
		System.out.print("sum of array =" + sum);

	}

}

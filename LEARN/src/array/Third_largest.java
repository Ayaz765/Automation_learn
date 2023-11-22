package array;

public class Third_largest {

	public static void main(String[] args) {
		int array[]= {1,19,7,6,5,3,13,9,4};
		int temp=0;
		
		for(int i= 0;i<array.length; i++)
      {
	  for(int j=i+1; j<array.length; j++)
	  {
		  if(array[j] < array[i])
		  {
			  temp=array[i];
			  array[i]=array[j];
			  array[j]=temp;
		  }
	  }
	
      }
 System.out.println("Third largest number =" + array[array.length-2]);

		}

}

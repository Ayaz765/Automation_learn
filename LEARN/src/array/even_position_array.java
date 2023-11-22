package array;

public class even_position_array {

	public static void main(String[] args) {
		int array[]= {1,7,8,2,9,4,1,5,9,5,1,};
		
		for(int i=1; i< array.length; i=i+2)
		{
			System.out.println("Even number" + array[i]);
		}
	}

}

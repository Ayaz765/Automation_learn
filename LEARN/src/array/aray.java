package array;
import java.util.*;  

public class aray {

	public static void main(String[] args) {
		
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Salman");
		list.add("Khan");
		list.add("Srk");
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());	
		}
	}

}

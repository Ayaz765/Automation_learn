package array_list;

import java.util.Iterator;
import java.util.LinkedList;

public class arraylist1 {

	public static void main(String[] args) {
		
		LinkedList <String> list= new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		Iterator<String> ir=list.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}

	}

}

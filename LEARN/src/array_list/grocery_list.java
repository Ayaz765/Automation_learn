package array_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class grocery_list {
	private static Scanner scanner= new Scanner(System.in);
	
	
	public static void main(String args[])
	{
		boolean flag=true;
		ArrayList<String> groc= new ArrayList<>();
		while(flag)
		{
			printaction();
			switch(Integer.parseInt(scanner.nextLine()))
			{
			
			case 1:
				additems(groc);
				
			case 2:
				removeitems(groc);
				
				
			
			
			
			default:
				flag=false;
				
			}
			groc.sort(Comparator.naturalOrder());
			
			System.out.println(groc);
		}
	}
	
	private static void additems(ArrayList<String> groc)
	{
		System.out.println("Add items by commas");
		String[] items= scanner.nextLine().split(" ,");
		groc.addAll(List.of(items));
		
		for(String i: items)
		{
			String trimmed= i.trim();
			if(groc.indexOf(trimmed)<0)
			{
				groc.add(trimmed);
				
			}
		}
	}
	
	private static void removeitems(ArrayList<String> groc)
	{
		System.out.println("remove items by commas");
		String[] items= scanner.nextLine().split(" ,");
		//groc.addAll(List.of(items));
		
		for(String i: items)
		{
			String trimmed= i.trim();
			
			
				groc.remove(trimmed);
				
			
		}
		
	}
	
	
	
	private static void printaction()
	{
		String textbox=" action: 0 for shutdown, 1 to add and 2 to remove";
		
		System.out.println(textbox + " ");
	}
	

}

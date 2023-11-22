package array_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {
	
	
	private static Scanner scanner= new Scanner(System.in);
	
	
	public static void main(String args[])
	{
		boolean flag=true;
		ArrayList<String> Student= new ArrayList<>();
		
		while(flag=true)
		{
			printaction();
			switch(Integer.parseInt(scanner.nextLine()))
			{
			case 1:
				
				addstudents(Student);
			
			case 2:
			
				removestudents(Student);
				
				default:
					flag=false;
			}
			
       Student.sort(Comparator.naturalOrder());
			
			System.out.println(Student);
		}
		
	}
	
	
	private static void addstudents(ArrayList<String> Student)
	{
		System.out.println("Add Students with commas to differntiate the names of students");
		String[] Student_name=scanner.nextLine().split(" , ");
		Student.addAll(List.of(Student_name));
		
		
	}
	
	private static void removestudents(ArrayList<String> Student)
	{
		System.out.println("Add Students with commas to differntiate the names of students");
		String[] Student_name=scanner.nextLine().split(" , ");
		Student.addAll(List.of(Student_name));
		
		
	}
	private static void printaction()
	
	{
		
		String Textbook="action:0 to shutdown, 1 to add student, 2 to remove student";
		System.out.println(Textbook + " ");
		
	}

}

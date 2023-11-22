import java.util.ArrayList;

public class Store {
	private static ArrayList<Product_for_sale> storeproducts= new ArrayList<>();
	
	public static void main( String args[])
	{
		storeproducts.add(new Artobject("oil painting", 1350, "good work by team"));
		storeproducts.add(new Artobject("scuplture", 1450, "nice gesture"));
		Listproducts();
	}
	
	public static void Listproducts()
	{
		for(var item:storeproducts)
		{
			System.out.println("-".repeat(30));
			item.showdetails();
		}
	}
	

}

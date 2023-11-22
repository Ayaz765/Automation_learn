
public abstract class Product_for_sale {

	protected String types;
	protected double price;
	protected String description;
	
	public Product_for_sale(String types, double price, String description)
	{
		this.types= types;
		this.price= price;
		this.description=description;
	}
		
		
		public double get_sales_price(int qty)
		{
			return qty * price;
		}
		
		public void print_price_items(int qty)
		{
			System.out.printf("%d qty at $%8.2f each, %-15s %-35s %n" ,qty, price,types, description);
	    }
		
		public abstract void showdetails();
		
}

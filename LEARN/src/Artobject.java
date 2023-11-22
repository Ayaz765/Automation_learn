
public class Artobject extends Product_for_sale {

	public Artobject(String types, double price, String description) {
		super(types, price, description);
		
	}

	@Override
	public void showdetails() {
		System.out.println("This" + types + "is a beautful reproduction");
		System.out.printf("The price of the piece is $%6.2f %n" , price);
		System.out.println(description);
		
		
	}

}

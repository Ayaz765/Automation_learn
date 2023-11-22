
public class Car {

	private String description;
	
	public Car(String description)
	{
		this.description=description;
	}
	public void StartEngine() {
		System.out.print("Car-Start engine");
	}
	protected void RunEngine() {
		System.out.print("Car-Run engine");
	}
	
	public void drive()
	{
		System.out.print("Car-driving" + getClass().getSimpleName());
		RunEngine();
	}
	
	
	class GaspowereCar extends Car
	{
		private double avgKmPerLiter;
		private int cylinder=6;
		
	public GaspowereCar(String description) {
			super(description);
			
		}
	public GaspowereCar(String description, double avgKmPerLiter, int cylinder)
	{
		super(description);
		this.avgKmPerLiter=avgKmPerLiter;
		this.cylinder=cylinder;
	}
	
	public void StartEngine() {
		System.out.println("GAS-> All % d cyilders are firedup, Ready!%n");
		
		
	}
	public void RunEngine() {
		System.out.println("GAS-> Usage exceed the average");
	}

	
		
	}
}




public class Main{

	public static void main(String[] args) {
		Car car= new Car("Creta");
		runRace(car);
		
		Car ferrari= new GaspowereCar("Creta",15.4,6);
		runRace(ferrari);

	}
	
	public static void runRace(Car car) {
		
		car.StartEngine();
		car.drive();

}
}

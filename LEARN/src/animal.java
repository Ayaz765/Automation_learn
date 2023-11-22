

abstract class animal {
	
	String colour;
	
	
	abstract double area_of_living();
	
	public animal(String colour) {
		System.out.println("animal Constructor is called");
		this.colour=colour;
	}

}


class Dog extends animal
{
	
	double length, breadth, area;

	public Dog(String colour,double length, double breadth ) {
		super(colour);
		System.out.println("Dog Constructor is called");
		this.length=length;
		this.breadth=breadth;
		
	
		
	}

	@Override
	double area_of_living() {
		System.out.println("Doggy Constructor is called");
		
		area=length * breadth ;
		
		return area ;
	}
	
}



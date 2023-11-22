package Abstract;

abstract  class demo {
	
	abstract void info_students();

}


class demo2 extends demo
{
public String name= "ayaz";
	void info_students() {
		
		if(name.equalsIgnoreCase("Ayaz"))
		{
			System.out.println("matched");
		}
		
		else
		{
			System.out.print("Not Matched");
		}
	}
	
	
}


class base
{
	public static void main(String[] args)
	{
		demo tag= new demo2();
		tag.info_students();
	}
}
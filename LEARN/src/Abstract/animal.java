package Abstract;

public abstract class animal {
	
	 public abstract void animalsound();

	 public void animalsleep() {
		 System.out.println("zzzzzzz");
	 }
}

 class dog extends animal
{
	public void animalsound() 
	{
		System.out.println("I am dog bahu ");
	}
}
 
 
 class main{
	 public static void main(String[] args)
	 {
		 dog qa= new dog();
		 qa.animalsleep();
	 }
 }

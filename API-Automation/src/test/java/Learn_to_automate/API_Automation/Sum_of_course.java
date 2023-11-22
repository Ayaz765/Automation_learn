package Learn_to_automate.API_Automation;

import org.testng.annotations.Test;

import Files.Payload;
import io.restassured.path.json.JsonPath;

public class Sum_of_course 
{
	@Test
	public static void main(String[] args)
	{
		
		
   JsonPath js= new JsonPath(Payload.coursprice());
   
	int count=	js.getInt("courses.size()");
	System.out.println(count);
	
	for(int i=0;i <count;i++)
	{
		int price=js.getInt("courses["+i+"].price");
		System.out.println(price);
		
		int copy=js.getInt("courses["+i+"].copies");
		System.out.println(copy);
		
		int sum=copy * price;
		
		System.out.println(sum);
		
		
	}
	
	
	}

}

package Files;

import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args)
	{
		JsonPath js= new JsonPath(Payload.coursprice());
		
		//Print no of course
		
	int count=	js.getInt("courses.size()");
	System.out.println(count);
	
	int amount=js.getInt("dashboard.purchaseAmount");
	
	System.out.println(amount);
	
	String coursename=js.getString("courses[0].title");
	
	System.out.println(coursename);
	
	
	for(int i=0;i <count;i++)
	{
		String price=js.getString("courses["+i+"].price");
		System.out.println(price);
		
		String copy=js.getString("courses["+i+"].copies");
		System.out.println(copy);
		
		
		
		
		
	}
	
	}

}

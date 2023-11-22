package Learn_to_automate.API_Automation;

import static io.restassured.RestAssured.given;

import Files.Payload;
import Reusable_Code.Resuablemethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

public class Basic {

	public static void main(String[] args) {
		
		//add palace
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(Payload.Add_Place()
			).when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js= new JsonPath(response);
		String place_id=js.get("place_id");
		System.out.println(place_id);
		
		
		//update palace
		String original_address="c-166 divya nagar colony ";
		given().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n" + 
				"\"place_id\":\""+place_id+"\",\r\n" + 
				"\"address\":\""+original_address+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}").when().put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200);		
		
		
		//get palace
	String responseone=	given().queryParam("key", "qaclick123").queryParam("place_id", place_id).when().get("/maps/api/place/get/json").then().assertThat().statusCode(200).extract()
		.response().asString();
		
	
	JsonPath js1=Resuablemethods.RawToJson(responseone);
	String actual_adress=js1.getString("address");
	System.out.println(actual_adress);
	Assert.assertEquals(actual_adress, original_address);
	
	

	}

}

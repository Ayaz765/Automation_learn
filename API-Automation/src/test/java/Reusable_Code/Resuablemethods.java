package Reusable_Code;

import io.restassured.path.json.JsonPath;

public class Resuablemethods {

	public static JsonPath RawToJson(String responseone) {
		// TODO Auto-generated method stub
		
		JsonPath js1= new JsonPath(responseone);
		
		return js1;

	}

}

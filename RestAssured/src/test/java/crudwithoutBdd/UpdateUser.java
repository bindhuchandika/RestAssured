package crudwithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateUser {
@Test
public void updateUser()
{
	JSONObject jobj = new JSONObject();
	jobj.put("name", "Ashish");
	jobj.put("job", "Teacher");
	
	//step1 : pre-condition
	RequestSpecification res = RestAssured.given().body(jobj).contentType(ContentType.JSON);
	
	//step2 : Actions
	Response resp = res.put("https://reqres.in/api/users/2");
	
	//step3 : Validation
	System.out.println(resp.prettyPeek());
}
}

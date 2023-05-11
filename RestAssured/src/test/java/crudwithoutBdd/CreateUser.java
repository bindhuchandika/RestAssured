package crudwithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {

@Test
public void createUser()
{
	JSONObject jobj = new JSONObject();
	jobj.put("name", "bindhu");
	jobj.put("job", "TE");
	
	//step1 : To specify pre-condition
    RequestSpecification req = RestAssured.given();
    req.body(jobj);
    req.contentType(ContentType.JSON);
    
	//step2 : Actions
	Response resp = req.post("https://reqres.in/api/users");
	
	//step3 : Validation
	resp.then().log().all();
	
	
	

}

}

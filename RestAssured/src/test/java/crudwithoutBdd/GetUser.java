package crudwithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUser {
@Test
public void getUser()
{
	//Step2 : Actions
	Response resp = RestAssured.get("https://reqres.in/api/users/2");
	
	//Step3 : Validation
	System.out.println(resp.prettyPeek());

	
}
}

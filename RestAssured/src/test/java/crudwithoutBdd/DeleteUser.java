package crudwithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteUser {
@Test
public void deleteUser()
{
	//Step2 : Actions
    Response resp = RestAssured.delete("https://reqres.in/api/users/2");
	
	//Step3 : Validation
//  System.out.println(resp.asString());
    System.out.println(resp.prettyPeek());
}
}

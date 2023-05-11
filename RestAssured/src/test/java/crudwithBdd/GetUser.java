package crudwithBdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetUser {	
@Test
public void getUser()
{
	
  // Step2 : Actions
   when()
  .get("https://reqres.in/api/users/2")
  
  // Step3 : Validation
  .then()
  .assertThat()
  .statusCode(200)
  .contentType(ContentType.JSON)
  .log().all();
   
}
}
package crudwithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUser {
	
@Test
public void createUser()
{
  JSONObject jobj = new JSONObject();
  jobj.put("name", "santhosh");
  jobj.put("job", "Lawyer");
  
  //step1 : To specify pre-condition
   given()
  .body(jobj)
  .contentType(ContentType.JSON)
  
  //step2 : Actions
  .when()
  .post("https://reqres.in/api/users")
  
  //step3 : Validation
  .then()
  .assertThat()
  .statusCode(201)
  .contentType(ContentType.JSON)
  .log().all();
  
}
}
package crudwithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateUser {
@Test
public void updateUser()
{
	JSONObject jobj = new JSONObject();
	jobj.put("name", "Joy");
	jobj.put("job", "civil Engg.");
	baseURI= "https://reqres.in";
	
	//step1 : To specify pre-condition
     given()
	.body(jobj)
	.contentType(ContentType.JSON)
	
	//step2 : Actions
    .when()
	.put("api/users/2")
	
	//step3 : Validation
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log().all();
	
}
	
}

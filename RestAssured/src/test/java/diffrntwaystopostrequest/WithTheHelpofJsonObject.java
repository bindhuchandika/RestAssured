package diffrntwaystopostrequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class WithTheHelpofJsonObject {
@Test
public void jsonObject()
{
	JSONObject jobj = new JSONObject();
	jobj.put("name", "Angel");
	jobj.put("job", "Doctor");
	
	 given()
	.body(jobj)
	.contentType(ContentType.JSON)
	
	.when()
	.post("https://reqres.in/api/users")
	
	.then()
	.assertThat()
	.statusCode(201)
	.contentType(ContentType.JSON)
	.log().all();
}
}

package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {
@Test
public void bearerToken()
{
	JSONObject jobj = new JSONObject();
	jobj.put("name", "RestAssured");
	jobj.put("description", "API");
    baseURI = "https://api.github.com";
    given()
   .auth()
   .oauth2("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")
   .body(jobj)
   
   .when()
   .post("/user/repos")
   
   .then()
   .assertThat()
   .log().all();   
}
}

package diffrntwaystopostrequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class WithTheHelpofHashMap {
@Test
public void withHashMap()
{
	baseURI = "https://reqres.in";
	HashMap hmap = new HashMap();
	hmap.put("name", "Olive");
	hmap.put("job", "Pastor");
	
	 given()
	.body(hmap)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/api/users")
	
	.then()
	.assertThat()
	.statusCode(201)
	.contentType(ContentType.JSON)
	.log().all();
}
}

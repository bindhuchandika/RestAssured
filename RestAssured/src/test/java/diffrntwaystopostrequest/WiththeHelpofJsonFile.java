
package diffrntwaystopostrequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class WiththeHelpofJsonFile {
@Test
public void withJsonFile()
{
	File file = new File(".//data.json");
	
	 given()
	.body(file)
	.contentType(ContentType.JSON)
	 
	.when()
	.post("https://reqres.in/api/users")
	
	.then()
	.assertThat()
	.statusCode(201)
	.log().all();
	
	
}
}

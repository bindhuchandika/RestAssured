package parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameter {
@Test
public void formParameter()
{
	 given()
	.formParam("name","bindhu")
	.formParam("job", "housewife")
    .contentType(ContentType.JSON)
     
    .when()
    .post("https://reqres.in/api/users")
    
    .then()
    .assertThat()
    .statusCode(201)
    .log().all();
    
    
}
}

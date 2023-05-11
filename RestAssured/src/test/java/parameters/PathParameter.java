package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {
@Test
public void pathParameter()
{
     given()
    .pathParam("petId", 13)
    
    .when()
    .get("https://petstore.swagger.io/v2/pet/{petId}")
    
    .then()
    .log().all();
}
}

package diffrntwaystopostrequest;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import io.restassured.http.ContentType;
import pojoclass.CreateUserOwn;

public class WithTheHelpofPojoClass2 {
@Test
public void pojoClass()
{
	CreateUserOwn cu = new CreateUserOwn(1,"abc","def","ghi","abc@gmail.com","123456","9133214938",333);

     given()
    .body(cu)
    .contentType(ContentType.JSON)
    
    .when()
    .post("https://petstore.swagger.io/v2/user")
    
    .then()
    .assertThat()
    .time(Matchers.lessThan(3000L),TimeUnit.MILLISECONDS)
    .log()
    .all();
    
    
}
	

}

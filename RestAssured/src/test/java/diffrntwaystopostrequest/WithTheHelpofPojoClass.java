package diffrntwaystopostrequest;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoclass.CreateUser;

public class WithTheHelpofPojoClass {
	
		@Test
		public void createUser()
		{
			CreateUser cu =  new CreateUser("Bindhu", "Teacher");
			
			 given()
			.body(cu)
			.contentType(ContentType.JSON)
			
			.when()
			.post("https://reqres.in/api/users")
			
			.then()
			.assertThat()
			.statusCode(201)
			.log().all();
			
		}

}

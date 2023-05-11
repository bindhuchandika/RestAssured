package crudwithBdd;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteUser {
@Test
public void deleteUser()
{
	
	//step2 : Actions
	 when()
	.delete("https://reqres.in/api/users/2")
	
	//step3 : Validation
	.then()
	.assertThat()
	.statusCode(204)
    .log().all();
}

}

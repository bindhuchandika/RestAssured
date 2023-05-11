package requestchaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChaining {
@Test
public void reqChaining()
{
	//step1 : get the list of users
	 Response resp = when()
	.get("https://reqres.in/api/users?page=1");
	 
	//step2 : capturing data from the response
	 int userID = resp.jsonPath().get("data[3].id");
	 System.out.println(userID);
	
	//step3 : second request (captured data is given as input)
	  given()
	 .pathParam("ID", userID)
	 
	 .when()
	 .get("https://reqres.in/api/users/{ID}")
	  
	 .then()
	 .log().all();
	  
	  

}
}

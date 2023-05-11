package datadriventesting;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoclass.CreateUser;

public class DDT {
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "Virat";
		data[0][1] = "Cricketer";
		
		data[1][0] = "Ronaldo";
		data[1][1] = "FootBall";
		
		data[2][0] = "Prabhas";
		data[2][1] = "Cine Hero";
		return data;
 	}	
	@Test(dataProvider="getData")
	public void createUser(String name, String job)
	{
		CreateUser cu =  new CreateUser(name, job);
		
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

package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class UserListTest extends BaseTest {
	
	@Test
	public void getUserTest()
	{
		Response response = given()
				.header("Accept","application/json")
				.when()
						.get("/api/users?page=2")
				.then()
						.statusCode(200)
						.extract().response();
		
			int total = response.jsonPath().getInt("total");
			System.out.println("Total user:"+total);
			
			assertTrue(total>0);
			
			
			
	}

}

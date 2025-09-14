package tests;

import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class CreateUserTest extends BaseTest{
	
	@Test
	public void createUserTest()
	{
		String payload = "{ \"name\": \"Bhushan\", \"job\": \"QA Engineer\" }";
		Response response = given()
                .header("Content-Type", "application/json")
                .body(payload)
        .when()
                .post("/api/users")
        .then()
                .statusCode(401) 
                .extract().response();

		String id = response.jsonPath().getString("id");
        String createdAt = response.jsonPath().getString("createdAt");

        System.out.println("User ID: " + id);
        assertNotNull(id);
        assertNotNull(createdAt);
	}
	
	
             
}
	
	



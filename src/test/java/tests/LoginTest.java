//package tests;
//
//
//
//import static org.testng.Assert.assertNotNull;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import static io.restassured.RestAssured.given;
//
//import base.BaseTest;
//import io.restassured.response.Response;
//
//public class LoginTest extends BaseTest{
//	
//	@Test
//	public void loginWithValidCredentials()
//	{
//		String payload = "{ \"email\": \"eve.holt@reqres.in\", \"password\": \"cityslicka\" }";
//
//        Response response = given()
//                .header("Content-Type", "application/json")
//                .body(payload)
//        .when()
//                .post("/api/login")
//        .then()
//                .statusCode(401)
//                .extract().response();
//
//        String token = response.jsonPath().getString("token");
//        System.out.println("Login Token: " + token);
//        assertNotNull(token, "Token should not be null");
//    }
//}
//

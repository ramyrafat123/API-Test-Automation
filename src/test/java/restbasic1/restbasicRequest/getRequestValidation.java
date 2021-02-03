package restbasic1.restbasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getRequestValidation {
  @Test
  public void getValidation_StatusCode() {
	  
	  RestAssured.baseURI="http://localhost:3000";
	  RequestSpecification httpRequest =RestAssured.given();
	  Response response =httpRequest.request(Method.GET, "/posts");
	  int StatusCode=response.statusCode();
	  Assert.assertEquals(200, StatusCode);
	  
  }
}

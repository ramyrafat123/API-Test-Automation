package restbasic1.restbasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getRequestValidation2 {
  @Test
  public void getValidation_ResponseBody() {
	  RestAssured.baseURI="http://localhost:3000";
	  RequestSpecification httpRequest =RestAssured.given();
	  Response response =httpRequest.request(Method.GET, "/posts");
	  String responseBodyAsString= response.getBody().asString();
	  Assert.assertTrue(responseBodyAsString.contains("Appiu"));
  }
}

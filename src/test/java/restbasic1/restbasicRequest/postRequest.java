package restbasic1.restbasicRequest;

import org.jvnet.staxex.StAxSOAPBody.Payload;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postRequest {
  @Test
  public void creatUserTest() {
	  RestAssured.baseURI="http://localhost:3000";
	  String payload="{\n"
	  		+ "    \"id\": 23,\n"
	  		+ "    \"title\": \"testApi#\",\n"
	  		+ "    \"author\": \"Ramy Rafat\"\n"
	  		+ "}";
	  RequestSpecification httpRequest=RestAssured.given();
	  httpRequest.header("Content-Type","application/json");
	  Response response= httpRequest.body(payload).post("/posts");
	  int StatusCode= response.getStatusCode();
	  System.out.println("Status code is "+ StatusCode);
  }
}

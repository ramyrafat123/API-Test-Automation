package restbasic1.restbasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {
  @Test
  public void delete_request() {
	  RestAssured.baseURI="http://localhost:3000";
	  RequestSpecification httpRequest=RestAssured.given();
	  String removeRequest="{\n"
		  		+ "    \"id\": 28,\n"
		  		+ "    \"title\": \"test#\",\n"
		  		+ "    \"author\": \"Ramy Rafat\"\n"
		  		+ "}";
	  httpRequest.header("Content-Type","application/json");
	  Response response= httpRequest.body(removeRequest).delete("/posts");
//	  Assert.assertEquals(204, response.getStatusCode());
	  System.out.println("statusCode"+response.getStatusCode());
	  
			  
  }
}

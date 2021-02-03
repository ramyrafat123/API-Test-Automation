package restbasic1.restbasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class getRequest {
  @Test
  public void getStatusCode () {
	  RestAssured.baseURI="http://localhost:3000";
	  RequestSpecification httpRequest =RestAssured.given();
	  Response response =httpRequest.request(Method.GET, "/posts");
	  int StatusCode=response.statusCode();
	  System.out.println("status code is "+ StatusCode);
	  ResponseBody body= response.getBody();
	  body.prettyPeek();
//	  System.out.println("response body"+ body.asString());
	  Headers header=response.getHeaders();
	  System.out.println("headers for Response" + header);
	  
	
  }
}

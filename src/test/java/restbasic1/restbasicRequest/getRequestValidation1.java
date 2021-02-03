package restbasic1.restbasicRequest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getRequestValidation1 {
  @Test
public void getValidation_ResponseHeader() {
	  
	  RestAssured.baseURI="http://localhost:3000";
	  RequestSpecification httpRequest =RestAssured.given();
	  Response response =httpRequest.request(Method.GET, "/posts");
	  Headers header=response.getHeaders();
	 
	  int countOfHeader=header.asList().size();
	  System.out.println("Count of Header "+countOfHeader);
	  Assert.assertEquals(13, countOfHeader);
	  String headerValue=response.getHeader("Content-Type");
	  Assert.assertEquals("application/json; charset=utf-8", headerValue);
	  
	  
  }
}

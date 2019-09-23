package testAPIs;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateRecord 
{
	@Test
 public void test1()
 {
		SoftAssert asser= new SoftAssert();
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
		
		//Request body
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", " Seeta Ram");
		requestParams.put("salary", "500000");
		requestParams.put("age", "56");
		
		//Headers
		request.header("Content-Type", "application/json");
		
		// Add the Json to the body of the request
				request.body(requestParams.toJSONString());
				
				//click send
				Response response = request.request(Method.POST);
				System.out.println(response.getStatusCode());
				System.out.println(response.asString());
				System.out.println("****************************************************");
				
				JsonPath jsonPathEvaluator = response.jsonPath();
				String id = jsonPathEvaluator.get("id");
				System.out.println(id);
				
				//Step 3: Update the record
				RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/update/"+id;
				request = RestAssured.given();
				requestParams = new JSONObject();
				requestParams.put("name", "sai Gunjal");
				requestParams.put("salary", "325433");
				requestParams.put("age", "25");
				request.header("Content-Type", "application/json");
				// Add the Json to the body of the request
				request.body(requestParams.toJSONString());
				// Post the request and check the response
				response = request.request(Method.PUT);
				int statusCode = response.getStatusCode();
				
				System.out.println(response.asString());
				System.out.println("****************************************************");
				
				
				//Step 4: Verify 
				RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/"+id;
				request = RestAssured.given();
				request.header("Content-Type", "application/json");
				response = request.request(Method.GET);
				
		
	 
 }
}

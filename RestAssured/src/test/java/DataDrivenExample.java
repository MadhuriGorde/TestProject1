import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class DataDrivenExample extends DataForTests {

	
	
	//@Test(dataProvider="PostData")
		public void test_post(String firstName,String lastName, int subjectId){
			JSONObject request=new JSONObject();
			
			request.put("firstName", firstName);
			request.put("lastName", lastName);
			request.put("subjectId", subjectId);
			System.out.println(request);
			//System.out.println(request.toJSONString());
			baseURI="http://localhost:3000/";
			
			given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).
			when().
			post("/users").
			then().
			statusCode(201).
			log().all();
		}
	
	
	
	
	@Parameters({"userId"})
	@Test
	public void test_delete(int userId){
		
		
		System.out.println(userId);
		when().
		delete("http://localhost:3000/users/"+userId).
		then().
		statusCode(200);
	}
	
}

package project.api.saucedemo.objects;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UsersApi {
	
	private static final String BASE_URL = "https://reqres.in";

	public static Response getUser(int id) {
		return RestAssured.given()
				.baseUri(BASE_URL)
				.basePath("api/users/" + id)
				.when()
				.get();
	}

	public static Response createUser(String name, String job) {
		return RestAssured.given()
				.baseUri(BASE_URL)
				.basePath("api/users/")
				.contentType("application/json")
				.body("{\"name\": \"" + name + "\", \"job\": \"" + job + "\"}")
				.when()
				.post();
	}
	
	public static Response updateUser(String name, String job, int id) {
		return RestAssured.given()
				.baseUri(BASE_URL)
				.basePath("api/users/" + id)
				.contentType("application/json")
				.body("{\"name\": \"" + name + "\", \"job\": \"" + job + "\"}")
				.when()
				.put();
	}
	
	public static Response deleteUser(int id) {
		return RestAssured.given()
				.baseUri(BASE_URL)
				.basePath("api/users/" + id)
				.when()
				.delete();
	}
	

}

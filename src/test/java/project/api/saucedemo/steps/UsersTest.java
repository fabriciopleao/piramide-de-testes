package project.api.saucedemo.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.response.Response;
import project.api.saucedemo.objects.UsersApi;

public class UsersTest {

	@Test
	public void testGetUser() {
		Response response = UsersApi.getUser(2);
		assertEquals(response.getStatusCode(), 200);
		String email = response.jsonPath().getString("data.email");
		assertEquals(email, "janet.weaver@reqres.in");
	}

	@Test
	public void testCreateUser() {
		Response response = UsersApi.createUser("Fabricio", "QA");
		assertEquals(response.getStatusCode(), 201);
		String name = response.jsonPath().getString("name");
		String job = response.jsonPath().getString("job");
		assertEquals(name, "Fabricio");
		assertEquals(job, "QA");
		assertTrue(response.jsonPath().get("id") != null);
	}

	@Test
	public void testUpdateUser() {
		Response response = UsersApi.updateUser("Leão", "DEV", 2);
		assertEquals(response.getStatusCode(), 200);
	}

	@Test
	public void testDeleteUser() {
		Response response = UsersApi.deleteUser(2);
		assertEquals(response.getStatusCode(), 204);
	}

}

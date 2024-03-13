package project.saucedemo;

public class LoginService {

	public String login(String username, String password) {
		
		if(username == null || username.isEmpty()) {
			return "Epic sadface: Username is required";
		}
		
		if(username.equals("locked_out_user")) {
			return "Epic sadface: Sorry, this user has been locked out.";
		}
		
		if(!username.equals("standard_user") || !password.equals("secret_sauce")) {
			return "Epic sadface: Username and password do not match any user in this service";
		}
		
		return "Login successful!";
	}
	
}

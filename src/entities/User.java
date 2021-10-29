package entities;

public class User {
	private String username;
	private String password;

	public User() {
		
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassorwd() {
		return password;
	}

	public void setPassword(String passorwd) {
		this.password = passorwd;
	}
	
}
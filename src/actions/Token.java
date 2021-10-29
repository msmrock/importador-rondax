package actions;

public class Token {
	private String scope;
	private Integer expires_in;
	private String username;
	private String token_type;
	private String access_token;
	private String refresh_token;

	public Token() {
		
	}

	public Token(String scope, Integer expires_in, String username, String token_type, String access_token,
			String refresh_token) {
		this.scope = scope;
		this.expires_in = expires_in;
		this.username = username;
		this.token_type = token_type;
		this.access_token = access_token;
		this.refresh_token = refresh_token;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Integer getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	


}

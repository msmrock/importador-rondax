package actions;

public class ErrorResponse {
	private String message;
	private String errorCode;
	private String reason;
	private String domain;
	private String service;
	
	public ErrorResponse() {

	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	

}

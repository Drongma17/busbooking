package com.app.busbooking.response;

public class Response {
	
	private Integer code;
	
	private String message;
	
	private Object responseData;

	public Response(Integer code, String message, Object responseData) {
		super();
		this.code = code;
		this.message = message;
		this.responseData = responseData;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponseData() {
		return responseData;
	}

	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}
	
	
	
	

}//end 

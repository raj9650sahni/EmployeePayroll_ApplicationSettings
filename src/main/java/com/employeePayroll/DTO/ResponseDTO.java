package com.employeePayroll.DTO;

public class ResponseDTO {
	
	private String messages;
	private Object data;
	
	public ResponseDTO(String messages, Object data) {
		super();
		this.messages = messages;
		this.data = data;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	

}

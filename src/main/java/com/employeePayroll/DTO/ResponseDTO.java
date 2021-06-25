package com.employeePayroll.DTO;

import lombok.Data;

public @Data class ResponseDTO {
	
	private String messages;
	private Object data;
	
	public ResponseDTO(String messages, Object data) {
		super();
		this.messages = messages;
		this.data = data;
	}

	

}

package com.youngkeun.realEstate.dto.reponse;

import com.youngkeun.realEstate.interfaces.Code;

public class CheckIdResponseDto {
	
	private Code code;
	private String data;
	
	public CheckIdResponseDto() {}
	
	
	public CheckIdResponseDto(Code code, String data) {
		super();
		this.code = code;
		this.data = data;
	}
	
	public Code getCode() {
		return code;
	}
	public void setCode(Code code) {
		this.code = code;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	

}

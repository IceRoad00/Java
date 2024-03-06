package com.youngkeun.realEstate.controller.implement;

import com.youngkeun.realEstate.controller.AuthController;
import com.youngkeun.realEstate.dto.reponse.CheckIdResponseDto;
import com.youngkeun.realEstate.dto.reponse.SendCodeResponseDto;
import com.youngkeun.realEstate.dto.request.CheckIdRequestDto;
import com.youngkeun.realEstate.dto.request.SendCodeRequestDto;
import com.youngkeun.realEstate.interfaces.Code;
import com.youngkeun.realEstate.service.AuthService;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService;
	
	public AuthControllerImplement (AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto request) {
		boolean validId = request.validId();
		if (!validId) return new CheckIdResponseDto(Code.VF, null);
		
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.validEmail();
		if (!valid) return new SendCodeResponseDto(Code.VF, null);
		
		SendCodeResponseDto response = authService.sendCode(request);
		return response;
		
		
	}

}

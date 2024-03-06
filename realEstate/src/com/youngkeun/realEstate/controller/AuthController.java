package com.youngkeun.realEstate.controller;

import com.youngkeun.realEstate.dto.reponse.CheckIdResponseDto;
import com.youngkeun.realEstate.dto.reponse.SendCodeResponseDto;
import com.youngkeun.realEstate.dto.request.CheckIdRequestDto;
import com.youngkeun.realEstate.dto.request.SendCodeRequestDto;

public interface AuthController {
	CheckIdResponseDto checkId(CheckIdRequestDto request);
	SendCodeResponseDto sendCode(SendCodeRequestDto request);

}

package com.youngkeun.realEstate.service;

import com.youngkeun.realEstate.dto.reponse.CheckIdResponseDto;
import com.youngkeun.realEstate.dto.reponse.SendCodeResponseDto;
import com.youngkeun.realEstate.dto.request.CheckIdRequestDto;
import com.youngkeun.realEstate.dto.request.SendCodeRequestDto;

public interface AuthService {
	CheckIdResponseDto checkId(CheckIdRequestDto dto);
	SendCodeResponseDto sendCode(SendCodeRequestDto dto);

}

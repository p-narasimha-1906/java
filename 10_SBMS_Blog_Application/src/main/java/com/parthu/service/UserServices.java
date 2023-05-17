package com.parthu.service;

import com.parthu.binding.LoginRequestModel;
import com.parthu.binding.SignUpRequestModel;

public interface UserServices {
	
	public String login(LoginRequestModel loginRequest);
	public String signUp(SignUpRequestModel signUpRequest);
}

package com.parthu.service;

import com.parthu.binding.LoginForm;
import com.parthu.binding.RegistrationForm;

public interface UserService {
	
	public boolean getRegistration(RegistrationForm form);

	public String getLogin(LoginForm form);

	

}

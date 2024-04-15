package com.login.controller;

import com.login.model.LoginDTO;
import com.login.service.LoginService;

public class LoginController {

	public String ValidateUser(LoginDTO loginDTO) {
		
		LoginService loginService=new LoginService();
		return loginService.ValidateUserPassword(loginDTO);
		
		
		
	}
	
}

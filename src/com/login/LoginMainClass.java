package com.login;

import com.login.controller.LoginController;
import com.login.model.LoginDTO;

public class LoginMainClass {

	public static void main(String[] args) {
		
		LoginDTO loginDTO=new LoginDTO();
		loginDTO.setUsername("Arun");
		loginDTO.setPassword("arun@98");
		LoginController loginController=new LoginController();
		System.out.println(loginController.ValidateUser(loginDTO));

	}

}

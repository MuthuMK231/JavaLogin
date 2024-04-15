package com.login.service;

import com.login.model.LoginDTO;
import com.login.repository.LoginRepository;

public class LoginService {
 public String ValidateUserPassword(LoginDTO loginDTO) {
	 String res;
	LoginRepository loginRepository=new LoginRepository();
	String passwordFromRepo=loginRepository.getpassword(loginDTO.getUsername());
	if(passwordFromRepo.equals(loginDTO.getPassword())) {
		res="User logged Successfully";
	}
	else {
		res="invalidUser";
	}
	return res;
 }
}

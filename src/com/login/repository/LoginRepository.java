package com.login.repository;

import java.util.HashMap;
import java.util.Map;

public class LoginRepository {
public String getpassword(String username){
	Map<String,String> dummdB=new HashMap<String, String>();
	dummdB.put("Arun","Arun@98");
	dummdB.put("hari","hari@88");
	return dummdB.get(username);
}

}

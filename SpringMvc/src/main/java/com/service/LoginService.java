package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.Logindao;

@Service
public class LoginService {
	
 @Autowired
 Logindao ld;
 public String signin(Login l)
 {
	if(ld.signIn(l)>0) 
		return "success";
		else
			return "fail";
 }
 public String signup(Login l)
 {
	if(ld.signUp(l)>0) 
		return "account created";
		else
			return "failed creation";
 }
}

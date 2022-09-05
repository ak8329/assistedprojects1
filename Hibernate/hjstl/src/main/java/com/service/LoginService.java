package com.service;

import com.Login;

public class LoginService {

	public String checkLoginDails(Login ll) {
		if(ll.getEmail().equals("ak8329@gmail.com") && ll.getPassword().equals("123")) {
			return "success";
		}else {
			return "falure";
		}
	}
}
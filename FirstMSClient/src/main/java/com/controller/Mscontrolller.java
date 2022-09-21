package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mscontrolller {
	@RequestMapping(value="msclient")
	public String sayhello()
	{
		return "get controller";
	}
}

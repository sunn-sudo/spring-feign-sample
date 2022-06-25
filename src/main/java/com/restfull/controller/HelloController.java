package com.restfull.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfull.httpclient.HelloClient;
import com.restfull.httpcom.HelloCom;

@RestController
public class HelloController {

	@Autowired
	private HelloCom hellocom;

	@GetMapping("api/hello")
	public String hello() {
		return hellocom.customHello();
	}

}

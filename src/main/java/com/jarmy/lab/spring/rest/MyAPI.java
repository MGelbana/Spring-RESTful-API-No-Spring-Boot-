package com.jarmy.lab.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/web", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyAPI {

	@RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public MyUser hello() {
		MyUser user = new MyUser();
		user.setName("Abbas");
		user.setId(12);
		return user;
	}

	@Autowired
	private Calculator calc;

	@RequestMapping(value = "/test2", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public int hello2() {
		return calc.getStatefulValue();
	}
}

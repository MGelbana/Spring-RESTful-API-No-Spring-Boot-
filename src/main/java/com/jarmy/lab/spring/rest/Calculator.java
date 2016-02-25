package com.jarmy.lab.spring.rest;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Calculator {
	private int id;

	public Calculator() {
		id = new Random().nextInt();
	}

	public int getStatefulValue() {
		return id;
	}

}

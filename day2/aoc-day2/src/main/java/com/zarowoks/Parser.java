package com.zarowoks;

public class Parser {
	
	private String passwordWithPolicy;

	public Parser(String passwordWithPolicy) {
		this.passwordWithPolicy = passwordWithPolicy;
	}

	public String getPassword() {
	return passwordWithPolicy.split(":\s")[1];
	}

}

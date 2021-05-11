package com.zarowoks;

public class Parser {

	public static String passwordWithPolicy;

	public Parser(String passwordWithPolicy) {
		Parser.passwordWithPolicy = passwordWithPolicy;
	}

	public String getPassword() {
		return passwordWithPolicy.split(":\s")[1];
	}

}

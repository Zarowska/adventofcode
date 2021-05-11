package com.zarowoks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Policy {

	private static String passwordWithPolicy;

	public Policy(String passwordWithPolicy) {
		Policy.passwordWithPolicy = passwordWithPolicy;
	}

	public int getLeastTime() {
		int result = 0;
		Pattern pattern = Pattern.compile("\\d*-");
		Matcher matcher = pattern.matcher(passwordWithPolicy);
		while (matcher.find()) {
			result = Integer.parseInt(passwordWithPolicy.substring(matcher.start(), matcher.end() - 1));
		}
		return result;
	}

	public int getMostTime() {
		int result = 0;
		Pattern pattern = Pattern.compile("-\\d*");
		Matcher matcher = pattern.matcher(passwordWithPolicy);
		while (matcher.find()) {
			result = Integer.parseInt(passwordWithPolicy.substring(matcher.start() + 1, matcher.end()));
		}
		return result;
	}

	public char getrequiredCharacter() {
		char result = ' ';
		Pattern pattern = Pattern.compile(":");
		Matcher matcher = pattern.matcher(passwordWithPolicy);
		while (matcher.find()) {
			String st = passwordWithPolicy.substring(matcher.start() - 1, matcher.end());
			result = st.charAt(0);
		}
		return result;
	}

}

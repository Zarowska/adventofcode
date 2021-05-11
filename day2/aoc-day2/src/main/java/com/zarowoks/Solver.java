package com.zarowoks;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solver {

	private List<String> passwordsWithPolicies;

	public Solver(Input input) {
		passwordsWithPolicies = input
				.readFile("C:\\Users\\oksana.zarowska\\Desktop\\JAVA\\adventofcode-main\\day2\\file.txt");
	}

	public int getResult() {
		int result = 0;
		for (String passwordWithPolicy : passwordsWithPolicies) {
			if (isValid(passwordWithPolicy)) {
				result++;
			}
		}
		return result;
	}

	private boolean isValid(String passwordWithPolicy) {
		Parser parser = new Parser(passwordWithPolicy);
		String password = parser.getPassword();

		Policy policy = new Policy(passwordWithPolicy);
		int leastTime = policy.getLeastTime();
		int mostTime = policy.getMostTime();
		char requiredCharacter = policy.getrequiredCharacter();
		String StrRequiredCharacter = Character.toString(requiredCharacter); 

		Pattern pattern = Pattern.compile(StrRequiredCharacter);
		Matcher matcher = pattern.matcher(password);
		int count =0;
		while (matcher.find()) {
			count++;
		}
		if (count >= leastTime && count <= mostTime) {
		return true;
		}
		return false;
	}

}

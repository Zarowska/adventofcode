package com.zarowoks;

import java.util.List;

public class Solver {

	private List<String> passwordsWithPolicies;

	public Solver(Input input) {
		passwordsWithPolicies = input.readFile("C:\\Users\\oksana.zarowska\\Desktop\\JAVA\\adventofcode-main\\day2\\file.txt");
	}

	public int getResult() {
		int result = 0;
		for (String passwordWithPolicy : passwordsWithPolicies) {
			if(isValid(passwordWithPolicy)){
				result++;
			}
		}
		return result;
	}

	private boolean isValid(String passwordWithPolicy) {
		Parser parser =  new Parser(passwordWithPolicy);
		String pwd = parser.getPassword();
		return false;
	}

}

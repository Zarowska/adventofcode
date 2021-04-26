package com.zarowoks;

import java.util.List;

public class Solver {

	private Input input;

	Solver(Input argInput) {
		this.input = argInput;
	}

	int getResult() {

		List<String> passwords = input.readFile(
				"C:\\Users\\oksana.zarowska\\Desktop\\JAVA\\adventofcode-main\\Day1_v2\\aoc-day1\\src\\main\\java\\com\\zarowoks\\file.txt");

		for (String elem : passwords) {
			int firstElem = Integer.parseInt(elem);
			for (String elem2 : passwords) {
				int secondElem = Integer.parseInt(elem2);
				if (firstElem + secondElem == 2020) {
					return firstElem * secondElem;
				}
			}

		}
		throw new IllegalStateException();
	}
}
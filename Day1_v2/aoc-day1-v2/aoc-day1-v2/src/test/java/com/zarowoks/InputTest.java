package com.zarowoks;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InputTest {
	 @Test
		void testReadFile() {
			Input input = new Input();
			List<String> listOfPasswords = input.readFile(
					"C:\\Users\\oksana.zarowska\\Desktop\\JAVA\\adventofcode-main\\Day1_v2\\aoc-day1\\src\\main\\java\\com\\zarowoks\\file.txt");
			// List<String> listOfPasswords = input.readFile("test.txt");
			Assertions.assertTrue(!listOfPasswords.isEmpty());
		}
}

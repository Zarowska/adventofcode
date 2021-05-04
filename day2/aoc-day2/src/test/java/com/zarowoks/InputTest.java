package com.zarowoks;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class InputTest {
	@Test
	public void testReadFile() {
		Input input = new Input();
		List<String> listOfPasswords = input.readFile(
				"C:\\Users\\oksana.zarowska\\Desktop\\JAVA\\adventofcode-main\\day2\\file.txt");
			Assert.assertTrue(!listOfPasswords.isEmpty());
	}
}

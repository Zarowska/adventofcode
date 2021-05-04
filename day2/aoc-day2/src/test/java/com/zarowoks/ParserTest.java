package com.zarowoks;

import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
	@Test
	public void testGetPassword() {
		Parser parser = new Parser("1-3 a: abcde");
		String password = parser.getPassword();
		Assert.assertEquals("abcde", password);
	}
	
}

package com.zarowoks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParameterTest {
	@Test
	void testSetParametr() {
		int par = Parameter.setParam();
		Assertions.assertEquals(2, par);
	}
}

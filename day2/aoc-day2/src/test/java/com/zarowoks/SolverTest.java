package com.zarowoks;

import org.junit.Assert;
import org.junit.Test;

class SolverTest {
	@Test
	void testGetResult() {
		Input input = new Input();
		int result = new Solver(input).getResult();
		Assert.assertEquals(121396, result);
	}

}

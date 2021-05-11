package com.zarowoks;

import org.junit.Assert;
import org.junit.Test;

public class SolverTest {
	@Test
	public void testGetResult() {
		Input input = new Input();
		int result = new Solver(input).getResult();
		Assert.assertEquals(560, result);
	}

}

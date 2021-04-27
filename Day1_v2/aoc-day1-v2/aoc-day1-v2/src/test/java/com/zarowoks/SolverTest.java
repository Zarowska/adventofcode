package com.zarowoks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolverTest {
	@Test
	void testGetResult() {
		Input input = new Input();
		int result = new Solver(input,2).getResult();
		Assertions.assertEquals(121396, result);
	}
	
}

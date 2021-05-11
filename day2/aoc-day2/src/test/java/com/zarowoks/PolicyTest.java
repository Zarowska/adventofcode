package com.zarowoks;

import org.junit.Assert;
import org.junit.Test;

public class PolicyTest {
	@Test

	public void testPolicy() {
		Policy policy = new Policy("1-3 a: abcde");
		int leastTime = policy.getLeastTime();
		Assert.assertEquals(1, leastTime);
		int mostTime = policy.getMostTime();
		Assert.assertEquals(3, mostTime);
		char requiredCharacter = policy.getrequiredCharacter();
		Assert.assertEquals('a', requiredCharacter);

	}

}

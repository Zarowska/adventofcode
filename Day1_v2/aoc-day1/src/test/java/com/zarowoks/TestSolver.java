package com.zarowoks;

import org.junit.Assert;

public class TestSolver {

    @org.junit.Test
    public void testGetResult() {
        Input input = new Input();
        int result = new Solver(input).getResult();
        Assert.assertEquals(121396, result);
    }
}
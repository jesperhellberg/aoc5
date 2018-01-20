package com.jjhellberg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogicTest {
    Logic logic = new Logic();

    @Test
    public void testStepCount() {
        assertEquals(5, logic.getStepCount("input\\testInput"));
    }

    @Test
    public void testStepCount2() {
        assertEquals(10, logic.getStepCount2("input\\testInput"));
    }

}
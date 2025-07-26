package com.lj;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App calc = new App();

    @Test
    public void test()
    {
        assertEquals(24,calc.add(20, 4));
        assertEquals(16,calc.sub(20, 4));
        assertEquals(80,calc.mul(20, 4));
        assertEquals(5,calc.div(20, 4));
    }
}

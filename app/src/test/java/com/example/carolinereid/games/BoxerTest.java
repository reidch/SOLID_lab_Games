package com.example.carolinereid.games;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 30/10/2017.
 */

public class BoxerTest {
    Boxer boxer;

    @Before
    public void before() {
        boxer = new Boxer("Nicola Adams", 25, 4);
    }

    @Test
    public void canCompete() {
        assertEquals("I am boxing", boxer.compete());
    }

    @Test
    public void canCalculate(){
        assertEquals(21, boxer.calculatePoints());
    }
}

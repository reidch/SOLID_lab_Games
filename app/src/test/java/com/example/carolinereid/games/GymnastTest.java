package com.example.carolinereid.games;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 30/10/2017.
 */

public class GymnastTest {
    Gymnast gymnast;
    Gymnast gymnast2;

    @Before
    public void before() {
        gymnast = new Gymnast("Nadia Comaneci", 12, 9);
        gymnast2 = new Gymnast("Beth Tweddle", 10, 2);
    }

    @Test
    public void canWarmUp() {
        assertEquals("I am warming up", gymnast.prepare());
    }

    @Test
    public void canCalculatePoints(){
        assertEquals(21, gymnast.calculatePoints());
    }

    @Test
    public void testCanBeAwardedMedal() {
        gymnast.awardedMedal();
        assertEquals(MedalStatus.GOLD, gymnast.getMedalStatus());
    }

//    @Test
//    public void testCanBeAwardedMedal() {
//        gymnast2.awardedMedal();
//        assertEquals(MedalStatus.SILVER, gymnast2.getMedalStatus());
//    }
}

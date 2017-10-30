package com.example.carolinereid.games;

/**
 * Created by carolinereid on 30/10/2017.
 */

public class Boxer extends Athlete {
    int hitsGiven;
    int hitsTaken;

    public Boxer(String name, int hitsGiven, int hitsTaken) {
        super(name);
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    public String compete() {
        return "I am boxing";
    }

    public int calculatePoints(){
        return hitsGiven -= hitsTaken;
    }
}

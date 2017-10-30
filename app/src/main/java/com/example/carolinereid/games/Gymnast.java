package com.example.carolinereid.games;

/**
 * Created by carolinereid on 30/10/2017.
 */

public class Gymnast extends Athlete {
    int diffPoints;
    int execPoints;

    public Gymnast(String name, int diffPoints, int execPoints) {
        super(name);
        this.diffPoints = diffPoints;
        this.execPoints = execPoints;
    }

    public int calculatePoints(){
        return diffPoints += execPoints;
    }

    public void setDiffPoints(int diffPoints) {
        this.diffPoints = diffPoints;
    }

    public void setExecPoints(int execPoints) {
        this.execPoints = execPoints;
    }
}

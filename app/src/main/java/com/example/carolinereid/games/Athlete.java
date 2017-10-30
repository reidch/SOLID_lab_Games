package com.example.carolinereid.games;

/**
 * Created by carolinereid on 30/10/2017.
 */

public abstract class Athlete {
    protected String name;
    protected MedalStatus medalStatus;

    public Athlete(String name) {
        this.name = name;
    }

    public String prepare() {
        return "I am warming up";
    }

    public MedalStatus getMedalStatus() {
        return this.medalStatus;
    }

    public void setMedalStatus(MedalStatus medalStatus) {
        this.medalStatus = medalStatus;
    }

    public abstract int calculatePoints();

    public void awardedMedal() {
        if (this.calculatePoints() >= 15) {
            this.medalStatus = MedalStatus.GOLD;}
        else if (this.calculatePoints() >= 10 && this.calculatePoints() <= 14) {
            this.medalStatus = MedalStatus.SILVER;}
        else if (this.calculatePoints() >= 5 && this.calculatePoints() <= 9) {
            this.medalStatus = MedalStatus.BRONZE;}
//        int points = calculatePoints();
//        if (points >= 5) {
//            this.medalStatus = MedalStatus.BRONZE;
//        }
//        if (points >= 10) {
//            this.medalStatus = MedalStatus.SILVER;
//        }
//        if (points >= 15) {
//            this.medalStatus = MedalStatus.GOLD;
//        }
    }
}

